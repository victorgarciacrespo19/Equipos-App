package es.upsa.ssi.trabajo1.wsjugadores.infrastructure.cdi;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.entities.Jugador;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wsjugadores.domain.repository.Repository;
import io.quarkus.cache.Cache;
import io.quarkus.cache.CacheName;
import io.quarkus.cache.redis.runtime.RedisCache;
import jakarta.annotation.PostConstruct;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Any;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.Optional;

@Decorator
@Dependent
public abstract class RepositoryDecorator implements Repository
{
    @Any
    @Delegate
    @Inject
    Repository repository;

    @Inject
    @CacheName("jugadores")
    Cache cache;

    @Inject
    Logger logger;

    RedisCache redisCache;

    @PostConstruct
    public void init()
    {
        redisCache = cache.as(RedisCache.class);
    }

    @Override
    public Optional<Jugador> getJugadorById(String id) throws EquiposAppException
    {
        Jugador cachedJugador = redisCache.getOrNull(id, Jugador.class).await().indefinitely();
        if(cachedJugador != null)
        {
            logger.info("Cache HIT jugador id " + id);
            return Optional.of(cachedJugador);
        }
        logger.info("Cache NOT FOUND jugador id " + id);
        Optional<Jugador> jugadorOpt = repository.getJugadorById(id);
        jugadorOpt.ifPresent(jugador -> redisCache.put(jugador.getIdJugador(), jugador).await().indefinitely());
        return jugadorOpt;

    }

    @Override
    public Jugador saveJugador(Jugador jugador) throws EquiposAppException {
        if(jugador.getIdJugador() == null)
        {
            Jugador newJugador = repository.saveJugador(jugador);
            redisCache.put(newJugador.getIdJugador(), newJugador).await().indefinitely();
            return newJugador;
        }
        else
        {
            if (redisCache.getOrNull(jugador.getIdJugador(), Jugador.class).await().indefinitely() != null)
            {
                redisCache.invalidate(jugador.getIdJugador()).await().indefinitely();
            }
            Jugador updatedJugador = repository.saveJugador(jugador);
            redisCache.put(updatedJugador.getIdJugador(), updatedJugador).await().indefinitely();
            return updatedJugador;
        }
    }

    @Override
    public void removeJugadorById(String id) throws EquiposAppException
    {
        repository.removeJugadorById(id);
        redisCache.invalidate(id).await().indefinitely();
    }
}

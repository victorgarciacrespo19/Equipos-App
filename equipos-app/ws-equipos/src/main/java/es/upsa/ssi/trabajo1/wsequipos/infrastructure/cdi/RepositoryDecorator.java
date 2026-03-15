package es.upsa.ssi.trabajo1.wsequipos.infrastructure.cdi;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wsequipos.application.repository.Repository;
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
    @CacheName("equipos")
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
    public Optional<Equipo> getEquiposById(String id) throws EquiposAppException
    {
        Equipo cachedEquipo = redisCache.getOrNull(id, Equipo.class).await().indefinitely();
        if(cachedEquipo != null)
        {
            logger.info("Cache HIT equipo id " + id);
            return Optional.of(cachedEquipo);
        }
        logger.info("Cache NOT FOUND equipo id " + id);
        Optional<Equipo> equipoOpt = repository.getEquiposById(id);
        equipoOpt.ifPresent(equipo -> redisCache.put(equipo.getId(), equipo).await().indefinitely());
        return equipoOpt;
    }

    @Override
    public Equipo saveEquipo(Equipo equipo) throws EquiposAppException
    {
        if(equipo.getId() == null)
        {
            Equipo newEquipo = repository.saveEquipo(equipo);
            redisCache.put(newEquipo.getId(), newEquipo).await().indefinitely();
            return newEquipo;
        }
        else
        {
            if (redisCache.getOrNull(equipo.getId(), Equipo.class).await().indefinitely() != null)
            {
                redisCache.invalidate(equipo.getId()).await().indefinitely();
            }
            Equipo updatedEquipo = repository.saveEquipo(equipo);
            redisCache.put(updatedEquipo.getId(), updatedEquipo).await().indefinitely();
            return updatedEquipo;
        }
    }

    @Override
    public void removeEquipoById(String id) throws EquiposAppException
    {
        repository.removeEquipoById(id);
        redisCache.invalidate(id).await().indefinitely();

    }
}

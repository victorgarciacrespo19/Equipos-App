package es.upsa.ssi.trabajo1.aggregator.implementarion.cdi;

import es.upsa.ssi.trabajo1.aggregator.domain.repository.Repository;
import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
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
    @Delegate
    @Any
    @Inject
    Repository repository;

    @Inject
    @CacheName("aggregator")
    Cache cache;

    @Inject
    Logger logger;

    private RedisCache redisCache;

    @PostConstruct
    public void init()
    {
        this.redisCache = cache.as(RedisCache.class);
    }

    @Override
    public Optional<Equipo> findEquipoById(String id) throws EquiposAppException {
        Equipo equipo = redisCache.getOrNull(id, Equipo.class).await().indefinitely();
        if(equipo != null)
        {
            logger.info("CACHE HIT equipo with id " + id);
            return Optional.of(equipo);
        }
        logger.info("CACHE DISMISS equipo with id " + id);
        Optional<Equipo> optCustomer = repository.findEquipoById(id);
        if(optCustomer.isPresent())
        {
            redisCache.put(id, optCustomer.get()).await().indefinitely();
        }


        return optCustomer;

    }
}

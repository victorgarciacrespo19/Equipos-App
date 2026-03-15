package es.upsa.ssi.trabajo1.wscontratos.infraestructure.cdi;

import es.upsa.ssi.trabajo1.domain.entities.Contrato;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wscontratos.domain.repository.Repository;
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
    @CacheName("contratos")
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
    public Optional<Contrato> findById(String id) throws EquiposAppException {
        Contrato cachedContrato = redisCache.getOrNull(id, Contrato.class).await().indefinitely();
        if(cachedContrato != null)
        {
            logger.info("Cache HIT contrato id " + id);
            return Optional.of(cachedContrato);
        }
        logger.info("Cache NOT FOUND contrato id " + id);
        Optional<Contrato> contratoOpt = repository.findById(id);
        contratoOpt.ifPresent(contrato -> redisCache.put(contrato.getId(), contrato).await().indefinitely());
        return contratoOpt;


    }

    @Override
    public Contrato save(Contrato contrato) throws EquiposAppException
    {

        Contrato saved = repository.save(contrato);

        if (saved.getId() != null) {
            redisCache.put(saved.getId(), saved).await().indefinitely();
        }

        return saved;
    }

    @Override
    public void removeById(String id) throws EquiposAppException
    {
        repository.removeById(id);
        redisCache.invalidate(id).await().indefinitely();
    }
}

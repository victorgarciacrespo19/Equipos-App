package es.upsa.ssi.trabajo1.wsequipos.application.usecases.impl;

import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wsequipos.application.usecases.RemoveEquipoUseCase;
import es.upsa.ssi.trabajo1.wsequipos.application.repository.Repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class RemoveEquipoUseCaseImpl implements RemoveEquipoUseCase {
    @Inject
    Repository repository;

    @Override
    public void execute(String id) throws EquiposAppException
    {
        repository.removeEquipoById(id);
    }
}

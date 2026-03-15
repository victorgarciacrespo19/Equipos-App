package es.upsa.ssi.trabajo1.wscontratos.application.impl;

import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wscontratos.application.RemoveContratoByIdUseCase;
import es.upsa.ssi.trabajo1.wscontratos.domain.repository.Repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class RemoveContratoByIdImpl implements RemoveContratoByIdUseCase
{
    @Inject
    Repository repository;

    @Override
    public void execute(String id) throws EquiposAppException
    {
        repository.removeById(id);
    }
}

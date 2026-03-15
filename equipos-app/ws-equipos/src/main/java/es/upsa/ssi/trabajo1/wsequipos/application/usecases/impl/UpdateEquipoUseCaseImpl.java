package es.upsa.ssi.trabajo1.wsequipos.application.usecases.impl;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wsequipos.application.usecases.UpdateEquipoUseCase;
import es.upsa.ssi.trabajo1.wsequipos.application.repository.Repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UpdateEquipoUseCaseImpl implements UpdateEquipoUseCase
{
    @Inject
    Repository repository;
    @Override
    public Equipo execute(Equipo equipo) throws EquiposAppException
    {
        return repository.saveEquipo(equipo);
    }
}

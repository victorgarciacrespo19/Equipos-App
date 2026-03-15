package es.upsa.ssi.trabajo1.wsequipos.application.usecases.impl;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wsequipos.application.usecases.GetEquipoUseCase;
import es.upsa.ssi.trabajo1.wsequipos.application.repository.Repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GetEquiposUseCaseImpl implements GetEquipoUseCase {
    @Inject
    Repository repository;


    @Override
    public List<Equipo> execute() throws EquiposAppException {
        List<Equipo> equipos = repository.getEquipos();
        return equipos ;
    }
}

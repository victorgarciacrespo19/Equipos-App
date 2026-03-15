package es.upsa.ssi.trabajo1.wsequipos.application.usecases.impl;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wsequipos.application.usecases.GetEquipoByIdUseCase;
import es.upsa.ssi.trabajo1.wsequipos.application.repository.Repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.Optional;

@ApplicationScoped
public class GetEquipoByIdUseCaseImpl implements GetEquipoByIdUseCase {
    @Inject
    Repository repository;
    @Override
    public Optional<Equipo> execute(String id) throws EquiposAppException {
        return repository.getEquiposById(id);
    }
}

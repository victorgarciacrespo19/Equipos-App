package es.upsa.ssi.trabajo1.wsequipos.application.usecases;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.Optional;

public interface GetEquipoByIdUseCase {
    public Optional<Equipo> execute(String id) throws EquiposAppException;
}

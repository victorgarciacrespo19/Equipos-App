package es.upsa.ssi.trabajo1.wsequipos.application.usecases;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.List;

public interface GetEquipoUseCase {
    List<Equipo> execute() throws EquiposAppException;
}

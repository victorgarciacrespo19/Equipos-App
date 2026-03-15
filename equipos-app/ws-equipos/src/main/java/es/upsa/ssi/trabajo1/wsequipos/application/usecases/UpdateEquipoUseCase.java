package es.upsa.ssi.trabajo1.wsequipos.application.usecases;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

public interface UpdateEquipoUseCase
{
    public Equipo execute(Equipo equipo) throws EquiposAppException;
}

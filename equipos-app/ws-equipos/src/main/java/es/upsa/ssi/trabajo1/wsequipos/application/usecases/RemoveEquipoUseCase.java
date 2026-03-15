package es.upsa.ssi.trabajo1.wsequipos.application.usecases;

import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

public interface RemoveEquipoUseCase
{
    void execute(String id) throws EquiposAppException;
}

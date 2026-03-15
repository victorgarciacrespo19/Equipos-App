package es.upsa.ssi.trabajo1.wscontratos.application;

import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

public interface RemoveContratoByIdUseCase
{
    void execute(String id)throws EquiposAppException;
}

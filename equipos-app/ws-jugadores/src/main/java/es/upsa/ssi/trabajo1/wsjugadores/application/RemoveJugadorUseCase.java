package es.upsa.ssi.trabajo1.wsjugadores.application;

import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

public interface RemoveJugadorUseCase
{
    void execute(String id) throws EquiposAppException;
}

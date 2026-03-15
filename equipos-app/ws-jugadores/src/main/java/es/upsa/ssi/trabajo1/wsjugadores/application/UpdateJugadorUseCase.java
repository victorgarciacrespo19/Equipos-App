package es.upsa.ssi.trabajo1.wsjugadores.application;

import es.upsa.ssi.trabajo1.domain.entities.Jugador;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

public interface UpdateJugadorUseCase
{
    public Jugador execute(Jugador jugador) throws EquiposAppException;
}

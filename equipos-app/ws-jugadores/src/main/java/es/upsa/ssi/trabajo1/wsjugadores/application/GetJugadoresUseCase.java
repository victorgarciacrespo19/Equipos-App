package es.upsa.ssi.trabajo1.wsjugadores.application;

import es.upsa.ssi.trabajo1.domain.entities.Jugador;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.List;

public interface GetJugadoresUseCase
{
    List<Jugador> execute() throws EquiposAppException;
}

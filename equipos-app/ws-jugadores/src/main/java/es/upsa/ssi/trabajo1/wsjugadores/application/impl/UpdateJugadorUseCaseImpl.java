package es.upsa.ssi.trabajo1.wsjugadores.application.impl;

import es.upsa.ssi.trabajo1.domain.entities.Jugador;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wsjugadores.application.UpdateJugadorUseCase;
import es.upsa.ssi.trabajo1.wsjugadores.domain.repository.Repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UpdateJugadorUseCaseImpl implements UpdateJugadorUseCase {

    @Inject
    Repository repository;
    @Override
    public Jugador execute(Jugador jugador) throws EquiposAppException
    {
        return repository.saveJugador(jugador);
    }
}

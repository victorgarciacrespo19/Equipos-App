package es.upsa.ssi.trabajo1.wsjugadores.application.impl;

import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.wsjugadores.application.RemoveJugadorUseCase;
import es.upsa.ssi.trabajo1.wsjugadores.domain.repository.Repository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class RemoveJugadorUseCaseImpl implements RemoveJugadorUseCase
{
    @Inject
    Repository repository;
    @Override
    public void execute(String id) throws EquiposAppException
    {
        repository.removeJugadorById(id);

    }
}

package es.upsa.ssi.trabajo1.aggregator.application;

import es.upsa.ssi.trabajo1.domain.aggregators.EquipoWithContratos;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.Optional;

public interface FindEquipoWithContratosByIdUseCase
{
    Optional<EquipoWithContratos> execute(String id) throws EquiposAppException;
}

package es.upsa.ssi.trabajo1.wscontratos.application;

import es.upsa.ssi.trabajo1.domain.entities.Contrato;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.Optional;

public interface GetContratoByIdUseCase
{
    Optional<Contrato> execute(String id) throws EquiposAppException;
}

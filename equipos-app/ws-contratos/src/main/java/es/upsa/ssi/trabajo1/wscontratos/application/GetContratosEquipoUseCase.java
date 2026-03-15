package es.upsa.ssi.trabajo1.wscontratos.application;

import es.upsa.ssi.trabajo1.domain.entities.Contrato;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

import java.util.List;

public interface GetContratosEquipoUseCase
{
    List<Contrato> execute(String idEquipo) throws EquiposAppException;
}

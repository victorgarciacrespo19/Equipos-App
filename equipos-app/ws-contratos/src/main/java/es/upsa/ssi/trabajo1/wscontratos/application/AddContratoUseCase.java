package es.upsa.ssi.trabajo1.wscontratos.application;

import es.upsa.ssi.trabajo1.domain.entities.Contrato;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

public interface AddContratoUseCase {
    Contrato execute(Contrato contrato) throws EquiposAppException;

}

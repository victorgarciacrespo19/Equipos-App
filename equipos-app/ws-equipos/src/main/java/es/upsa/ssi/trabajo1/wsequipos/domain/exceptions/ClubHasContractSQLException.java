package es.upsa.ssi.trabajo1.wsequipos.domain.exceptions;

import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

public class ClubHasContractSQLException extends EquiposAppException {
    public ClubHasContractSQLException() {
        super("El club tiene contratos con jugadores en vigor");
    }
}

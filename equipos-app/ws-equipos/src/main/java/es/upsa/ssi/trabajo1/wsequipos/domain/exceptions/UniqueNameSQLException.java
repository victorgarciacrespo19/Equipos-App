package es.upsa.ssi.trabajo1.wsequipos.domain.exceptions;

import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

public class UniqueNameSQLException extends EquiposAppException {
    public UniqueNameSQLException() {
        super("Nombre de Equipo ya existente");
    }
}

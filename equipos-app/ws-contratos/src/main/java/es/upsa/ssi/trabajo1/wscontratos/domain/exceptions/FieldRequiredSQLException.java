package es.upsa.ssi.trabajo1.wscontratos.domain.exceptions;

import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;

public class FieldRequiredSQLException extends EquiposAppException {
    public FieldRequiredSQLException(String fieldName)
    {
        super("El campo " + fieldName  + " es obligatorio");
    }
}

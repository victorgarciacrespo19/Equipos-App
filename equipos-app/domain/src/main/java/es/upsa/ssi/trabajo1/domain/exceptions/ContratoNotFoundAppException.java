package es.upsa.ssi.trabajo1.domain.exceptions;

public class ContratoNotFoundAppException extends NotFoundAppException
{
    public ContratoNotFoundAppException() {
        super("El contrato no existe");
    }
}

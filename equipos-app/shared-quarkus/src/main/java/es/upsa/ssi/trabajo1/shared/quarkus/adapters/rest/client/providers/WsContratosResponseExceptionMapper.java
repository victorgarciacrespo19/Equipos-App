package es.upsa.ssi.trabajo1.shared.quarkus.adapters.rest.client.providers;

import es.upsa.ssi.trabajo1.domain.exceptions.ContratoNotFoundAppException;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.domain.exceptions.RestClientAppException;

public class WsContratosResponseExceptionMapper extends WsResponseExceptionMapper<EquiposAppException>{
    public WsContratosResponseExceptionMapper() {
        super((message)-> new RestClientAppException(message), () -> new ContratoNotFoundAppException());
    }
}

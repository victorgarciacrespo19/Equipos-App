package es.upsa.ssi.trabajo1.shared.quarkus.adapters.rest.client.providers;

import es.upsa.ssi.trabajo1.domain.exceptions.EquipoNotFoundAppException;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.domain.exceptions.RestClientAppException;

public class WsEquiposResponseExceptionMapper extends WsResponseExceptionMapper<EquiposAppException>{
    public WsEquiposResponseExceptionMapper() {
        super((message)-> new RestClientAppException(message), () -> new EquipoNotFoundAppException());
    }
}

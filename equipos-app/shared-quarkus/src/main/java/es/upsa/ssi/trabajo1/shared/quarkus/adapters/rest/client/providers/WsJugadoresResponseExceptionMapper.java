package es.upsa.ssi.trabajo1.shared.quarkus.adapters.rest.client.providers;

import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.domain.exceptions.JugadorNotFoundAppException;
import es.upsa.ssi.trabajo1.domain.exceptions.RestClientAppException;

public class WsJugadoresResponseExceptionMapper extends WsResponseExceptionMapper<EquiposAppException>{
    public WsJugadoresResponseExceptionMapper() {
        super((message)-> new RestClientAppException(message), () -> new JugadorNotFoundAppException());
    }
}

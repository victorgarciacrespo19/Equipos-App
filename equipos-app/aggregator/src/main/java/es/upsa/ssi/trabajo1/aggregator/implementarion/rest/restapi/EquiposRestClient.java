package es.upsa.ssi.trabajo1.aggregator.implementarion.rest.restapi;

import es.upsa.ssi.trabajo1.domain.entities.Equipo;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.shared.quarkus.adapters.rest.client.providers.WsEquiposResponseExceptionMapper;
import es.upsa.ssi.trabajo1.shared.quarkus.adapters.rest.providers.StringToListParamConverterProvider;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(configKey = "rest.client.equipos")
@RegisterProvider(StringToListParamConverterProvider.class)
@RegisterProvider(WsEquiposResponseExceptionMapper.class)
@Path("/equipos")
public interface EquiposRestClient
{
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Equipo findById(@PathParam("id") String id) throws EquiposAppException;
}

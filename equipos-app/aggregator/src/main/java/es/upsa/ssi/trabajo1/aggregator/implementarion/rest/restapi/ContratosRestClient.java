package es.upsa.ssi.trabajo1.aggregator.implementarion.rest.restapi;


import es.upsa.ssi.trabajo1.domain.entities.Contrato;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.shared.quarkus.adapters.rest.client.providers.WsContratosResponseExceptionMapper;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient(configKey = "rest.client.contratos")
@RegisterProvider(WsContratosResponseExceptionMapper.class)
@Path("/contratos")
public interface ContratosRestClient
{
    @GET
    @Path("/equipos/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    List<Contrato> findContratoByEquipoId(@PathParam("id") String id) throws EquiposAppException;

}

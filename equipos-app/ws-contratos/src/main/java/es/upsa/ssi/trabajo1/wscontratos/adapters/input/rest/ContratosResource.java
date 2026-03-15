package es.upsa.ssi.trabajo1.wscontratos.adapters.input.rest;

import es.upsa.ssi.trabajo1.domain.dtos.ContratoDto;
import es.upsa.ssi.trabajo1.domain.entities.Contrato;
import es.upsa.ssi.trabajo1.domain.exceptions.ContratoNotFoundAppException;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.domain.mappers.Mappers;
import es.upsa.ssi.trabajo1.wscontratos.application.AddContratoUseCase;
import es.upsa.ssi.trabajo1.wscontratos.application.GetContratoByIdUseCase;
import es.upsa.ssi.trabajo1.wscontratos.application.GetContratosEquipoUseCase;
import es.upsa.ssi.trabajo1.wscontratos.application.RemoveContratoByIdUseCase;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import org.jboss.logging.Logger;

import java.net.URI;
import java.util.List;

@Path("/contratos")
@RequestScoped
public class ContratosResource {
    @Inject
    Logger log;
    @Inject
    GetContratoByIdUseCase getContratoByIdUseCase;
    @Inject
    GetContratosEquipoUseCase getContratosEquipoUsecase;

    @Inject
    AddContratoUseCase addContratoUsecase;

    @Inject
    RemoveContratoByIdUseCase removeContratoByIdUseCase;


    @Context
    UriInfo uriInfo;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContratoById(@PathParam("id") String id) throws EquiposAppException
    {
        return getContratoByIdUseCase.execute(id).map(contrato -> Response.ok()
                                                                          .entity(contrato)
                                                                          .build()
                                                     )
                                                .orElseThrow(()-> new ContratoNotFoundAppException());
    }
    @GET
    @Path("/equipos/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContratosEquipo(@PathParam("id")String idEquipo) throws EquiposAppException
    {
        List<Contrato> contratos = getContratosEquipoUsecase.execute(idEquipo);
        return Response.ok()
                       .entity(new GenericEntity<List<Contrato>>(contratos){})
                       .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addContrato(ContratoDto contratoDto,  @DefaultValue("") @HeaderParam("X-Forwarded-Prefix") String prefix) throws EquiposAppException
    {
        Contrato contrato = addContratoUsecase.execute(Mappers.toContrato(contratoDto));
        return Response.created(createContratoURI(contrato, prefix))
                        .entity(contrato)
                        .build();
    }

    @Path("/{id}")
    @DELETE
    public Response removeCreditoById(@PathParam("id") String id) throws EquiposAppException
    {
        removeContratoByIdUseCase.execute(id);
        return Response.noContent()
                       .build();
    }

    private URI createContratoURI(Contrato contrato, String prefix)
    {
        return uriInfo.getBaseUriBuilder()
                .path(prefix)
                .path("/contratos")
                .path(contrato.getId())
                .build();
    }

}

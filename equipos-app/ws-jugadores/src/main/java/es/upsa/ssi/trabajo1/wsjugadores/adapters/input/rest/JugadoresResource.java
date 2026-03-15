package es.upsa.ssi.trabajo1.wsjugadores.adapters.input.rest;

import es.upsa.ssi.trabajo1.domain.dtos.JugadorDto;
import es.upsa.ssi.trabajo1.domain.entities.Jugador;
import es.upsa.ssi.trabajo1.domain.exceptions.EquiposAppException;
import es.upsa.ssi.trabajo1.domain.exceptions.JugadorNotFoundAppException;
import es.upsa.ssi.trabajo1.domain.mappers.Mappers;
import es.upsa.ssi.trabajo1.wsjugadores.application.*;
import es.upsa.ssi.trabajo1.wsjugadores.application.*;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@Path("/jugadores")
@RequestScoped
public class JugadoresResource {

    @Inject
    GetJugadorByIdUseCase getJugadorByIdUseCase;
    @Inject
    GetJugadoresUseCase getJugadoresUseCase;
    @Inject
    UpdateJugadorUseCase updateJugadorUseCase;
    @Inject
    AddJugadorUseCase addJugadorUseCase;
    @Inject
    RemoveJugadorUseCase removeJugadorUseCase;


    @Context
    UriInfo uriInfo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJugadores() throws EquiposAppException
    {
        List<Jugador> jugadores = getJugadoresUseCase.execute();
        return Response.ok()
                .entity(new GenericEntity <List <Jugador>>(jugadores){})
                .build();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJugadoresById(@PathParam("id") String id) throws EquiposAppException
    {
        Optional<Jugador> optJugador = getJugadorByIdUseCase.execute(id);
        return optJugador.map(jugador -> Response.ok()
                                                 .entity(jugador)
                                                 .build()
                              )
                          .orElseThrow(()-> new JugadorNotFoundAppException());
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addJugador(JugadorDto jugadorDto) throws EquiposAppException
    {
        Jugador jugador = Mappers.toJugador(jugadorDto);
        Jugador insertedJugador = addJugadorUseCase.execute(jugador);
        return Response.created(createJugadorURI(insertedJugador) )
                       .entity(insertedJugador)
                       .build();
    }

    @Path("/{id}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateJugador(@PathParam("id") String id, JugadorDto jugadorDto) throws EquiposAppException
    {
        Jugador jugador = Mappers.toJugador(jugadorDto)
                                 .withIdJugador(id);
        Jugador updateJugador = updateJugadorUseCase.execute(jugador);
        return Response.ok()
                       .entity(updateJugador)
                       .build();
    }
    @Path("/{id}")
    @DELETE
    public Response deleteJugadorById(@PathParam("id") String id) throws EquiposAppException
    {
        removeJugadorUseCase.execute(id);
        return Response.noContent()
                       .build();
    }


    private URI createJugadorURI(Jugador jugador)
    {
        return uriInfo.getBaseUriBuilder()
                .path("/jugadores")
                .path(jugador.getIdJugador())
                .build();

    }
}

package rest;

import service.GameService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("game")
public class GameRestService
{
    @Inject
    private GameService gameService;

    @GET
    public Response getGames()
    {
        return Response.ok().build();
    }

    @GET
    @Path("{id}")
    public Response getGameWithId(@PathParam("id") int id)
    {
        return Response.ok().build();
    }

    @GET
    @Path("genre/{genre}")
    public Response getGameWithGenre(@PathParam("genre") String genre)
    {
        return Response.ok().build();
    }
}

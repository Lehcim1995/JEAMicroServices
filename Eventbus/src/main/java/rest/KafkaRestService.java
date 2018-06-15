package rest;

import domain.Game;
import service.KafkaService;
import util.RestUtil;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/request")
public class KafkaRestService
{
    @Inject
    private KafkaService kafkaService;

    @GET
    @Path("/users")
    public Response getUsers()
    {
        return Response.ok().build();
    }

    @GET
    @Path("/get/{id}")
    public Response getGet(@PathParam("id") int id)
    {
        Game game = new Game();
        game.setId(id);

        return Response.ok(RestUtil.convertGenericenetity(kafkaService.getInvitablePlayers(game))).build();
    }
}

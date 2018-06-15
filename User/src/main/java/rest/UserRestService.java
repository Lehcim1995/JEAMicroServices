package rest;

import service.UserService;
import util.RestUtil;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import static util.RestUtil.convertGenericenetity;

@Path("user")
public class UserRestService
{
    @Inject
    private UserService userService;

    @GET
    public Response getUsers()
    {
        return Response.ok(convertGenericenetity(userService.getUsers()))
                       .build();
    }

    @GET
    @Path("{id}")
    public Response getUser(@PathParam("id") int id)
    {
        return Response.ok(userService.getUser(id))
                       .build();
    }

    @GET
    @Path("/games/{id}")
    public Response getUserByGame(@PathParam("id") int gameId)
    {
        return Response.ok(convertGenericenetity(userService.getUsersByGame(gameId)))
                       .build();
    }


}

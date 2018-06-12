package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("user")
public class UserRestService
{
    @GET
    public Response getUsers()
    {
        return Response.ok().build();
    }
}

package rest;

import service.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import java.util.List;

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

    private <T> GenericEntity convertGenericenetity(List<T> list)
    {
        return new GenericEntity<List<T>>(list) {};
    }
}

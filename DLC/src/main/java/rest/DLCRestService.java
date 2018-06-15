package rest;

import service.DLCService;
import util.RestUtil;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import static util.RestUtil.convertGenericenetity;

@Path("dlc")
public class DLCRestService
{
    @Inject
    private DLCService dlcService;

    @GET
    public Response getDLC()
    {
        return Response.ok(convertGenericenetity(dlcService.getDLCs())).build();
    }
}

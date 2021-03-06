package co.refiere.resources.util;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NoContentException;
import javax.ws.rs.core.Response;

import co.refiere.resources.base.PrizeObjectData;
import co.refiere.services.PrizeService;

@Path("v1/prize")
public class PrizeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public Response getAllPrizes() {
        String response = "{\"status\": \"%s\", %s}";
        try {
            PrizeService prizeService = new PrizeService();
            List<co.refiere.resources.base.PrizeObjectData> prizes = prizeService.getAllPrizes();
            GenericEntity<List<PrizeObjectData>> list = new GenericEntity<List<PrizeObjectData>>(prizes) {};
            return Response.ok(list).build();
        } catch (NoContentException e) {
            response = String.format(response, "FAIL", e.getMessage());
        } catch (NullPointerException exception) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.status(200).entity(response).build();
    }
}

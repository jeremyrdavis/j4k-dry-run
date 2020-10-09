package org.j4k.workshops.quarkus.infrastructure;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.j4k.workshops.quarkus.favfood.domain.FavFoodOrder;

@Path("/api")
public class ApiResource {

    @POST
	@Path("/favfood")
    public Response placeOrder(final FavFoodOrder favFoodOrder){
        return Response.accepted().entity(favFoodOrder).build();
    }
}

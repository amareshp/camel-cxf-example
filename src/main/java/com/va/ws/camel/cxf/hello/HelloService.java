package com.va.ws.camel.cxf.hello;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public interface HelloService {

    @GET
    @Produces({MediaType.APPLICATION_JSON })
    //@Consumes("application/json")
    //@Produces({"application/json"})
    @Path("/hello")
    public Response hello(@QueryParam("name") String name);
    
}

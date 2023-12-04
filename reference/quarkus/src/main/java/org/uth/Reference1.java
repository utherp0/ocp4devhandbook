package org.uth;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/reference")
public class Reference1 
{
  @GET
  @Path("/hello")
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() 
  {
    return "Hello RESTEasy";
  }
}

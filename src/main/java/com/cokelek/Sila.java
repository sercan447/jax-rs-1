
package com.cokelek;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/java")
public class Sila {

 @GET
public Response azmet(){
 return  Response.status(200).entity("AZM").build();
}

@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/get/{id}")
public Response getCustomerDetails(@PathParam("id") String custId){
    String d = "GET Eklme islemi :"+custId;
    return Response.status(200).entity(d).build();
}

@PUT
@Consumes(MediaType.TEXT_PLAIN)
@Path("/put/{id}")
public Response updateCustomerDetails(@PathParam("id") String custId){

    String de = "PUT Edilen : "+custId;
    return Response.status(200).entity(de).build();
}

@DELETE
@Produces(MediaType.TEXT_PLAIN)
@Path("/del/{id}")
public Response deleteCustomerDetails(@PathParam("id")String custId){

    return Response.status(200).entity("DELETE edilen : "+custId).build();
}
    

}


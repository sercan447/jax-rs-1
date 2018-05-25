package com.cokelek;

import com.cokelek.beans.Person;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/formNotationExample")
public class Kahret {
    
    
    public Response processParams(/*@Form*/  Person person){
        
        return Response.status(200).entity(person).build();
    }
    
}

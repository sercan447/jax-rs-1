package com.cokelek;

import com.cokelek.beans.Customer;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customers")
public class JsonFromRestful {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/majeste/{ad}/{soyad}/{yas}")
    public Customer produceJSON(@PathParam("ad")String ad ,
                                @PathParam("soyad")String Soyad,
                                @PathParam("yas")int yas){
    
        Customer cus = new Customer();
                 cus.setCusCountry(ad);
                 cus.setCustName(Soyad);
                 cus.setCustNo(yas);
                 
                 return cus;
                         
    
    }
}

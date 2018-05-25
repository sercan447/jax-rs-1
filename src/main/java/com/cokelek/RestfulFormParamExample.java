
package com.cokelek;

import com.cokelek.beans.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

@Path("/books")
public class RestfulFormParamExample {
    
   //static Logger logger = Logger.getLogger(RestfulFormParamExample.class);
    static List<Book> bookList = new ArrayList<Book>();
    
    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    public Response addBook(@FormParam("isbn")String ISBN,
                            @FormParam("name")String names,
                            @FormParam("author")String authors,
                            @FormParam("publisher")String publisher,
                            @FormParam("stock_qty") int stockQty,
                            @FormParam("price")double price){
    
    
        Book b = new Book();
             b.setISBN(ISBN);
             b.setName(names);
             b.setAuthor(authors);
             b.setPublisher(publisher);
             b.setStockQty(stockQty);
             b.setPrice(price);
             
             bookList.add(b);
             String msg = "adddBook : "+b.toString();
             
             return Response.ok(msg).entity(msg).build();
    }//method
    
    @POST
    @Path("/list")
    //@Produces
    public Response getBooks(){
    String msgi = "getBook : "+bookList;
    
    return Response.ok(200).entity(msgi).build();
    }
    
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("/hazar")
    public Response showHeaders(@HeaderParam("Accept") String accept,
                                @HeaderParam("Host")String host,
                                @HeaderParam("Cache-Control")String cache,
                                @HeaderParam("User-Agent")String useragent,
                                @HeaderParam("Referer")String referer){
    
    
        StringBuffer msg = new StringBuffer("Header Bilgileri : <br/>");
        msg.append("Accept : ");
        msg.append(accept);
        msg.append("<br/>");
        msg.append("Host : ");
        msg.append(host);
        msg.append("<br/>");
        msg.append("Cache-Control : ");
        msg.append(cache);
        msg.append("<br/>");
        msg.append("User-Agent : ");
        msg.append(useragent);
        msg.append("<br/>");
        msg.append("Referer : ");
        msg.append(referer);
        msg.append("<br/>");
        
        return Response.ok(msg.toString()).entity(msg.toString()).build();
    }
    
    @POST
    @Path("/map")
   // @Produces(MediaType.TEXT_HTML)
    public Response viewmap(MultivaluedMap<String,String> formfields){
        
        StringBuffer msg = new StringBuffer("From Degiskennleri <br/> <br/>");
        for(String field : formfields.keySet()){
            msg.append(field);
            msg.append(" *: ");
            msg.append(formfields.get(field));
            msg.append("<br/>");
        }//foreach
        
        return Response.status(200).entity(msg.toString()).build();
        
    }
}

package br.com.unilago.ltp.Consumidor.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.unilago.ltp.Consumidor.entity.Consumidor;

@Path("/consumidor")
public class ConsumidorResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Consumidor> getAll(){
        return Consumidor.listAll();
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Consumidor consumidor){
        consumidor.persist();
        return Response.status(Status.CREATED).entity(consumidor).build();
    }
    
}
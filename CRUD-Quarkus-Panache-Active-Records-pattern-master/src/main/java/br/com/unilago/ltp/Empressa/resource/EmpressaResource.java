package br.com.unilago.ltp.Empressa.resource;

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

import br.com.unilago.ltp.Empressa.entity.Empressa;

@Path("/empressa")
public class EmpressaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Empressa> getAll(){
        return Empressa.listAll();
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Empressa Empressa){
        Empressa.persist();
        return Response.status(Status.CREATED).entity(Empressa).build();
    }
    
}
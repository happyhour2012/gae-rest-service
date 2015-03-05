package ch.axa.hh.service;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ch.axa.hh.model.Einkaufsliste;


@Path("/einkaufslisten")
@RequestScoped
public class EinkauflisteRESTService {
	
    @Inject
    private Logger log;
    
    @Inject
    private EinkauflisteService einkauflisteService; 
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Einkaufsliste> listAllMembers() {
    	log.info("liste"); 
        return einkauflisteService.listAllEinkaufslisten();
    }
    
    
    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Einkaufsliste getEinkauflisteForName(@PathParam("name")String name){
    	log.info("forName"); 
    	return einkauflisteService.getEinkauflisteForName(name); 
    }
    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addEinkaufsliste(Einkaufsliste einkaufsliste){
    	log.info("add"); 
    	einkauflisteService.addEinkaufsliste(einkaufsliste); 
    }
    
    @DELETE
    @Path("/{name}")
    public void deleteEinkaufslisteWithName(@PathParam("name")String name){
    	log.info("delete"); 
    	einkauflisteService.removeEinkaufslisteForName(name); 
    }
    
    @GET
    @Path("/count")
    @Produces(MediaType.APPLICATION_JSON)
    public int count(){
    	log.info("count");
    	return einkauflisteService.count(); 
    }
    
    
    
    
    
    
    
    

}

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
import ch.axa.hh.model.HRVertrag;
import ch.axa.hh.model.MFVertrag;
import ch.axa.hh.model.Portfolio;
import ch.axa.hh.model.Vertrag;


@Path("/vererbung")
@RequestScoped
public class VererbungRESTService {
	
    @Inject
    private Logger log;
    
   
    
    
    @GET
    @Path("/portxml")
    @Produces(MediaType.APPLICATION_XML)
    public Portfolio portfolioxml(){
        log.info("port");
        
        Vertrag auto = new MFVertrag("audi", 100); 
        Vertrag haus = new HRVertrag("uhr", 200); 
        
        Portfolio portfolio = new Portfolio(); 
        
        portfolio.addVertrag(haus); 
        portfolio.addVertrag(auto); 
        
        
        return portfolio; 
    }
    
    
    
    
    @GET
    @Path("/portjson")
    @Produces(MediaType.APPLICATION_JSON)
    public Portfolio portfoliojson(){
        log.info("port");
        
        Vertrag auto = new MFVertrag("audi", 100); 
        Vertrag haus = new HRVertrag("uhr", 200); 
        
        Portfolio portfolio = new Portfolio(); 
        
        portfolio.addVertrag(haus); 
        portfolio.addVertrag(auto); 
        
        
        return portfolio; 
    }
    
    
    
    
    
    
    
    

}

package ch.axa.hh.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ch.axa.hh.model.Einkaufsliste;

public class EinkauflisteServiceTest {
	
	EinkauflisteService service = new EinkauflisteService(); 

	
	@Before
	public void setUp() throws Exception {
		
		Einkaufsliste einkaufsliste = new Einkaufsliste(); 
		einkaufsliste.setTitel("Coop"); 
		
		service.addEinkaufsliste(einkaufsliste); 

	}
	
	
	@Test
	public void testAddEinkaufsliste() {
		Einkaufsliste einkaufsliste = new Einkaufsliste(); 
		einkaufsliste.setTitel("Migros"); 
		
		service.addEinkaufsliste(einkaufsliste); 
		assertEquals(3, service.count()); 

	}

	@Test
	public void testGetEinkauflisteForName() {
		Einkaufsliste einkaufsliste = service.getEinkauflisteForName("Coop");
		assertEquals("Coop", einkaufsliste.getTitel());
		einkaufsliste = service.getEinkauflisteForName("Aldi");
		assertNull(einkaufsliste); 
		
		
	}

	@Test
	public void testRemoveEinkaufslisteForName() {
		Einkaufsliste einkaufsliste = service.getEinkauflisteForName("Coop");
		assertEquals("Coop", einkaufsliste.getTitel());
		
		service.removeEinkaufslisteForName("Coop"); 
		
		einkaufsliste = service.getEinkauflisteForName("Coop");
		assertNull(einkaufsliste); 
		
	}

}

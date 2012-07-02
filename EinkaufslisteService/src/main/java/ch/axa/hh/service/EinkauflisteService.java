package ch.axa.hh.service;


import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import ch.axa.hh.model.Einkaufsliste;

@ApplicationScoped
public class EinkauflisteService {
	
	private List<Einkaufsliste> einkaufslisten = new ArrayList<Einkaufsliste>(); 
	
	public EinkauflisteService() {
		Einkaufsliste einkaufsliste = new Einkaufsliste(); 
		einkaufsliste.setTitel("Giovanelli"); 
		
		addEinkaufsliste(einkaufsliste); 
	}
	
	public void addEinkaufsliste(Einkaufsliste einkaufsliste){
		einkaufslisten.add(einkaufsliste); 
	}
	
	public Einkaufsliste getEinkauflisteForName(String name){
		for (Einkaufsliste einkaufsliste : einkaufslisten) {
			if (einkaufsliste.getTitel().contains(name)){
				return einkaufsliste; 
			}
		}
		return null; 
	}
	
	public void removeEinkaufslisteForName(String name){
		for(int i=0; i < einkaufslisten.size();  i++){
			if (einkaufslisten.get(i).getTitel().equals(name)){
				einkaufslisten.remove(i); 
			}
		}
	}

	public int count() {
		return einkaufslisten.size(); 
	}
	
	public List<Einkaufsliste> listAllEinkaufslisten(){
		return einkaufslisten; 
	}
	
	

}

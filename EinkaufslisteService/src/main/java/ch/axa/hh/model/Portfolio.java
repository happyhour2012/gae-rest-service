package ch.axa.hh.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Portfolio {
    
    
    public Portfolio() {
        // TODO Auto-generated constructor stub
    }
    
    private List<Vertrag> liste = new ArrayList<Vertrag>();

    public List<Vertrag> getListe() {
        return liste;
    }

    public void setListe(List<Vertrag> liste) {
        this.liste = liste;
    } 
    
    
    public void addVertrag(Vertrag vertrag){
        liste.add(vertrag); 
    }
    
    

}

package ch.axa.hh.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MFVertrag extends Vertrag {
    
    public MFVertrag() {
        // TODO Auto-generated constructor stub
    }
    
    
    public MFVertrag(String marke, int pramie) {
        super(pramie);
        this.marke = marke;
    }

    private String marke;

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    } 
    
    

}

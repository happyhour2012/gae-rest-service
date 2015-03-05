package ch.axa.hh.model;

public class HRVertrag extends Vertrag {
    
    public HRVertrag() {
        // TODO Auto-generated constructor stub
    }
    
    public HRVertrag(String string, int i) {
        super(i); 
        this.ding = string; 
    }

    private String ding;

    public String getDing() {
        return ding;
    }

    public void setDing(String ding) {
        this.ding = ding;
    } 
    
    
    

}

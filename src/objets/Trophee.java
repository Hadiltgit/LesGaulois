package objets;
import personnages.*;
public class Trophee {
	
    private Gauloi gauloi ;
    private Equipement equipement;
    
    public Trophee (Gauloi gauloi,Equipement equipement) {
    	   gauloi = this.gauloi;
    	   this.equipement=equipement;
    }
    
    public Gauloi getGauloi() {
    	     return gauloi;
    }
    public Equipement getEquipement() {
    	     return equipement;
    }
    
    public String donnerNom() {
    	   return gauloi.getNom();
    }
}

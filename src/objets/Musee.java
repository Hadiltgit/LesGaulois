package objets;
import personnages.*;
public class Musee {
	
   private Trophee[] trophees = new Trophee[200];
   private int nbTrophee=0;
   private Gauloi gauloi;
   
   public Musee (Gauloi gauloi) {
	   this.gauloi=gauloi;
   }
   
   public Gauloi getGauloi(){
	 return gauloi;  
   }   
   
   public Trophee[] getTrophees(){
	   return trophees;
   }   
   
   
   public int getNbTrophee(){
	   return nbTrophee;
   }   
   
   public void donnerTrophees (Gauloi gauloi , Equipement equipement) {
	   trophees[nbTrophee+1]= new Trophee(gauloi,equipement);
   }
}

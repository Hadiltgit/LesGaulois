package personnages;
import objets.*;

public class Gauloi {
    
	private String nom;
	//private int force;
	private int effetPotion=1;
	private Village village ;
	
	//modification1
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	
	public Gauloi (String nom, int force) {
	this.nom = nom;
	this.force = force;
	}
	
	
	public String getNom() {
	return nom;
	}
	
	public void setVillage(Village village) {
		this.village=village;
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
//	private String prendreParole() {
//	return "Le gaulois " + nom + " : ";
//	}
	
//modification2
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		
	}

    public static void main(String[] args) {
		
		Gauloi astirix = new Gauloi("Astirix",8);
		
		System.out.println(astirix );
		System.out.println(astirix.getNom() );
		
		Musee musee = new Musee (astirix);
		musee.donnerTrophees(astirix,Equipement.BOUCLIER);
		musee.donnerTrophees(astirix,Equipement.CASQUE);
		musee.donnerTrophees(astirix,Equipement.CASQUE);
		astirix.faireUneDonnation (musee);
    }


   @Override
	public String toString() {
		return "Gauloi [nom=" + nom + "]";
	}
	
	
	
//	public void frapper(Romain romain) {
//		
//		String nomRomain = romain.getNom();
//		
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
//		
//		int forceCoup = (force*effetPotion) / 3;
//		romain.recevoirCoup(forceCoup);
//		if(effetPotion>1) {
//		 effetPotion=effetPotion-1;
//		}
//	}
    
 //modification3
    public void frapper(Romain romain) {
    	System.out.println(nom + " envoie un grand coup dans la m�choire de " +
    	romain.getNom());
    	Equipement[] tropheesL = romain.recevoirCoup((force / 3) * effetPotion);
    	for (int i = 0; tropheesL != null && i < tropheesL.length; i++,
    	nbTrophees++) {
    	this.trophees[nbTrophees] = tropheesL[i];
    	}
    	}
    
    
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
	}
		
    	
	
    public void sePresenter(){
    	
    	if(village!=null) {
    		    if(this == village.getChef() ) {
    	                parler("Bonjour, je m'appelle"+nom+". Je suis le chef le village "+village.getNom());
    	        }else {
    	        	 parler("Bonjour, je m'appelle "+nom+". J'habite le village "+village.getNom());
    	        }
 	   }else{
    	    		   parler("Bonjour, je m'appelle "+nom+". Je voyage de villages en villages.");
       }
    }
    	
   
   public void faireUneDonnation (Musee musee) {
	   if(musee.getNbTrophee()>=1) {
		  System.out.println(prendreParole()+"« Je donne au musee tous mes trophees :"); 
		  Trophee[] trophees = musee.getTrophees();
		  for(int i = 0 ; i < trophees.length ; i++) {
			  System.out.println("- "+trophees[i]+"\n");  
		  }
		  System.out.println("»");
	   }
	}
   
   public String extraireInstructionsOCaml (Musee musee) {
	   if(musee.getNbTrophee()>=1) { 
			  Trophee[] trophees = musee.getTrophees();
			  String b ="";
			  for(int i = 0 ; i < trophees.length ; i++) {
				  b=b+" \" "+musee.getGauloi().getNom()+" \" , \" "+trophees[i]+" \" \n";  
			  }
			  return "let musee = [ \n"+b+"]";
		   }else {
			   return "rien";
		   }
	   
   }
    
}

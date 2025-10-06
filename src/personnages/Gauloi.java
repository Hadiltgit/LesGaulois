package personnages;

public class Gauloi {
    
	private String nom;
	private int force;
	private int effetPotion=1;
	private Village village;
	
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
	
	private String prendreParole() {
	return "Le gaulois " + nom + " : ";
	}

    public static void main(String[] args) {
		
		Gauloi astirix = new Gauloi("Astirix",8);
		
		System.out.println(astirix );
    }


	@Override
	public String toString() {
		return "Gauloi [nom=" + nom + "]";
	}
	
	public void frapper(Romain romain) {
		
		String nomRomain = romain.getNom();
		
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		
		int forceCoup = (force*effetPotion) / 3;
		romain.recevoirCoup(forceCoup);
		if(effetPotion>1) {
		 effetPotion=effetPotion-1;
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
    	

    
}

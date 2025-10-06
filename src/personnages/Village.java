package personnages;

public class Village {

	private String nom;
	private int nbvillageois=0;
	
	private Gauloi[] villageois = new Gauloi[77] ;
	private Gauloi chef;
	
	public String getNom() {
		return nom;
	}
	
	public Gauloi getChef() {
		return chef;
	}
	
	
	
	
	public Village(String nom , int nbvillageois , Gauloi chef ) {
		this.nom=nom;
		this.nbvillageois=nbvillageois;
		this.chef=chef;
	}
	
    	int nbr=0;
	public void ajouterVillageois(Gauloi gauloi) {
		villageois[nbr]=gauloi;
		nbr++;
	}
	
    public Gauloi trouverVillageois(int numVillageois) {
		if(numVillageois <= nbr) {
			return villageois[numVillageois] ;
		}else{
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
	}
    
   
    
    public static void main(String[] args) {
    	
    	  Gauloi chef = new Gauloi("Abraracourcix",6);
    	  
        
    	   Village village = new Village("Village des Irraductibles",30 , chef);
    	   
    	   village.ajouterVillageois(chef);
    	   chef.setVillage(village);
    	   
    	   Gauloi Astirix = new Gauloi("Astirix",8);
    	   
    	   village.ajouterVillageois(Astirix);
    	   Astirix.setVillage(village);
    	   
    	   Gauloi gaulois = village.trouverVillageois(1);
    	   System.out.println(gaulois.getNom());
    	   gaulois = village.trouverVillageois(2);
    	   System.out.println(gaulois);
    	   
    	   
    	   System.out.println("Dans le village \" "+village.getNom()+"\" du chef "+village.trouverVillageois(0).getNom()+" vivent les lagendaires gaulois :");
    	   gaulois = village.trouverVillageois(1);
    	   System.out.println("-"+gaulois.getNom());
    	   
    	   
    	   Gauloi obelix = new Gauloi("Obelix",25);
    	   obelix.setVillage(village);
    	   village.ajouterVillageois(obelix);
    	   village.afficherVillage();

    	   
    	   Gauloi DoublePolemix = new Gauloi("DoublePolemix",4);
    	   
    	   Astirix.sePresenter();
    	   obelix.sePresenter();
    	   DoublePolemix.sePresenter();
    	   chef.sePresenter();
    }
    
   public void afficherVillage() {
    	
	   for(int i=0 ; i<nbr ; i++) {
		   System.out.println(villageois[i].getNom());
	   }
    }
   
   
}

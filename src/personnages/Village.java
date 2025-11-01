package personnages;

public class Village {

	private String nom;
	private int nbvillageois=0;
	
	private Gauloi chef ;
	private Gauloi[] villageois ;
	
	public String getNom() {
		return nom;
	}
	
	public Gauloi getChef() {
		return chef;
	}
	
	
	public Village(String nom , Gauloi chef , int nbVillMax) {
		this.nom=nom;
		this.chef=chef;
		this.chef.setVillage(this);
	    villageois = new Gauloi[nbVillMax] ;
		
	}
	
    
	public void ajouterVillageois(Gauloi gauloi) {
		villageois[nbvillageois]=gauloi;
		nbvillageois++;
		gauloi.setVillage(this);
	}
	
	public Gauloi trouverVillageois(int numeroVillageois) {
	    if (numeroVillageois > 0 && numeroVillageois <= nbvillageois) {
	        return villageois[numeroVillageois - 1];  
	    } else {
	        System.out.println("Il n’y a pas autant d’habitants dans notre village !");
	        return null;
	    }
	}

    
   
    
    public static void main(String[] args) {
    	
    	  Gauloi chef = new Gauloi("Abraracourcix",6);
    	  
    	   Village village = new Village("Village des Irraductibles", chef,30);
    	   
    	   Gauloi gaulois = village.trouverVillageois(30);
    	     	   
    	   Gauloi Astirix = new Gauloi("Astirix",8);
    	   
    	   village.ajouterVillageois(Astirix);
    	   
    	   Gauloi gauloi = village.trouverVillageois(1);
    	   System.out.println(gauloi.getNom());
    	   gauloi = village.trouverVillageois(2);
    	   System.out.println(gauloi);
    	   
    	   
    	   System.out.println("Dans le village \" "+village.getNom()+"\" du chef "+village.chef.getNom()+" vivent les lagendaires gaulois :");
    	   gauloi= village.trouverVillageois(1);
    	   System.out.println("-"+gauloi.getNom());
    	   
    	   
    	   Gauloi obelix = new Gauloi("Obelix",25);
    	   village.ajouterVillageois(obelix);
    	   village.afficherVillageois();

    	   
    	   Gauloi DoublePolemix = new Gauloi("DoublePolemix",4);
    	   
    	   Astirix.sePresenter();
    	   obelix.sePresenter();
    	   DoublePolemix.sePresenter();
    	   chef.sePresenter();
    	   
    }
    
    
   public void afficherVillageois() {
	   System.out.println(chef.getNom());
	   for(int i=0 ; i<nbvillageois ; i++) {
		   System.out.println(villageois[i].getNom());
	   }
    }
   
   
}

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
	
	
	public Village(String nom ,int nbvillageois) {
		this.nom=nom;
		this.nbvillageois=nbvillageois;
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
    	  
        
    	   Village village = new Village("Village des Irréductibles",30);
    	   
    	   village.ajouterVillageois(chef);
    	   
    	   Gauloi Astérix = new Gauloi("Astérix",8);
    	   
    	   village.ajouterVillageois(Astérix);
    	   
    	   Gauloi gaulois = village.trouverVillageois(1);
    	   System.out.println(gaulois.getNom());
    	   gaulois = village.trouverVillageois(2);
    	   System.out.println(gaulois);
    	   
    	   
    	   System.out.println("Dans le village \" "+village.getNom()+"\" du chef "+village.trouverVillageois(0).getNom()+" vivent les légendaires gaulois :");
    	   gaulois = village.trouverVillageois(1);
    	   System.out.println("-"+gaulois.getNom());
    	   
    	   
    	   Gauloi Obélix = new Gauloi("Obélix",25);
    	   village.ajouterVillageois(Obélix);
    	   village.afficherVillage();

    	   
    	   Gauloi DoublePolémix = new Gauloi("DoublePolémix",4);
    	   
    	   Astérix.sePresenter();
    	   Obélix.sePresenter();
    	   DoublePolémix.sePresenter();
    }
    
    /*Dans le village "Village des Irréductibles" du chef Abraracourcix
vivent les légendaires gaulois :
- Astérix*/
   public void afficherVillage() {
    	
	   for(int i=0 ; i<nbr ; i++) {
		   System.out.println(villageois[i].getNom());
	   }
    }
   
   
}

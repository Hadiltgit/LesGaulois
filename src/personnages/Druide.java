package personnages;

public class Druide {
     
	private String nom;
	private int force;
	
	
    public String getNom() {
	   return nom;
    }
    
    public  Druide(String nom , int force) {
    	  this.nom=nom;
    	  this.force=force;
    }
    
    public void parler(String texte) {
    	System.out.println(prendreParole() + "\"" + texte + "\"");
    	}
    	
    	private String prendreParole() {
    	return "Le Druide " + nom + " : ";
    	}
    	
    	Chaudron ob = new Chaudron();
    	
    	public void fabriquerPotion(int quantite ,int forcePotion) {
    		
    		ob.remplirChaudron(quantite ,forcePotion);
    		
    		System.out.println(prendreParole()+"\"j'ai concote "+quantite+" doses de posion magique.Elle a une force de "+forcePotion+".\"");
    		
    	}

    	public void booster(Gauloi obb) {
    		
    		boolean contientPotion = ob.resterPotion();
    		
    		String nomGauloi = obb.getNom();
    		
    		if(contientPotion==true) {
    			if(nomGauloi=="Obélix") {
    				parler("Non "+nomGauloi+" Non!...Et tu le sais tres bien!");
    			}else {
    				int forcePotion = ob.prendreLouche();
    				obb.boirePotion(forcePotion);
    				parler("Tiens "+nomGauloi+" un peu de potion magique");
    			}
    		}else {
    			parler("Desole"+nomGauloi+" il n'y a plus une seule goutte de potion");
    		}
    		
    	}
}

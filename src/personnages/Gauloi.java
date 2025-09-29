package personnages;

public class Gauloi {
    
	private String nom;
	private int force;
	private int effetPotion=1;
	
	
	public Gauloi (String nom, int force) {
	this.nom = nom;
	this.force = force;
	}
	
	
	public String getNom() {
	return nom;
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
	return "Le gaulois " + nom + " : ";
	}

    public static void main(String[] args) {
		
		Gauloi asterix = new Gauloi("Astérix",8);
		
		System.out.println(asterix );
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
		

}

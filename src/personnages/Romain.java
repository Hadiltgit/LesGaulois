package personnages;

public class Romain {

	private String nom;
	private int force;
	
	
	public Romain(String nom, int force) {
	this.nom = nom;
	this.force = force;
	assert isInvariantVerified();
	}
	
	
	public String getNom() {
	return nom;
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
	return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force < 1) {
		force = 0;
		parler("J'abandonne !");
		} else {
		parler("Aïe");
	    }
		assert isInvariantVerified();
	}	
	
	
	public String prenPar() {
		return prendreParole();
	}
	
	private boolean isInvariantVerified() {
		if(force>=0) {
			return true;
		}else {
			return false;
		}	
	}
	
	public static void main (String[] args) {
		Romain minus = new Romain ("minus",6);
	}
	
}

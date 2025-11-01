package personnages;
import objets.*;
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
	
	Equipement[] equipements = new Equipement[2];
	int nbEquipement=0;
	
	public void sEquiper(Equipement equipement) {
	    switch (nbEquipement) {
	        case 2:
	            System.out.println("Le soldat " + nom + " est déjà bien protégé !");
	            break;

	        case 1:
	            if (equipements[0] == equipement) {
	                System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
	            } else {
	                equipements[nbEquipement] = equipement;
	                nbEquipement++;
	                System.out.println("Le soldat " + nom + " s’équipe avec un " + equipement + ".");
	            }
	            break;

	        default: 
	            equipements[nbEquipement] = equipement;
	            nbEquipement++;
	            System.out.println("Le soldat " + nom + " s’équipe avec un " + equipement + ".");
	            break;
	    }
	}

	
	public static void main (String[] args) {
		Romain minus = new Romain ("minus",6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		
		minus.sEquiper(Equipement.CASQUE);
	    minus.sEquiper(Equipement.CASQUE);
	    minus.sEquiper(Equipement.BOUCLIER);
	    minus.sEquiper(Equipement.CASQUE);
		
	}
	
}

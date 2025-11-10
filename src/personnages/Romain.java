package personnages;
import objets.*;
public class Romain {

	private String nom;
	private int force;
	//modification1
	
	
	
	public Romain(String nom, int force) {
	this.nom = nom;
	this.force = force;
	assert isInvariantVerified();
	}
	
	
	public String getNom() {
	return nom;
	}
	
	//modification5
	public int getForce() {
		return force;
	}
	
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
	return "Le romain " + nom + " : ";
	}
	
//	public void recevoirCoup(int forceCoup) {
//		force -= forceCoup;
//		if (force < 1) {
//		force = 0;
//		parler("J'abandonne !");
//		} else {
//		parler("Aïe");
//	    }
//		assert isInvariantVerified();
//	}	
	
//---------------------------------------------------------------------------	
//modification2
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force == 0) {
		   parler("A�e");
		}else {
		equipementEjecte = ejecterEquipement();
		parler("J'abandonne...");
		}
		return equipementEjecte;
		}
	
//modification3	
	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de" + forceCoup;
		int resistanceEquipement = 0;
		if ((nbEquipement != 0)) {
		texte += "\nMais heureusement, grace � mon �quipement sa force estdiminu� de ";
		for (int i = 0; i < nbEquipement;i++) {
		   if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
		        resistanceEquipement += 8;
		   } else {
		        System.out.println("Equipement casque");
		        resistanceEquipement += 5;
		    }
		}
		texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		if (forceCoup < 0) { 
			forceCoup = 0;
		} 
		return forceCoup;
	}
	
//modification4
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'�quipement de " + nom.toString() + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
		  if (equipements[i] != null) {
			equipementEjecte[nbEquipementEjecte] = equipements[i];
			nbEquipementEjecte++;
			equipements[i] = null;
		  } 
		}
		return equipementEjecte;
		}
//---------------------------------------------------------------------------	
	
	
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

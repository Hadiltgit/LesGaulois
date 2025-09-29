package personnages;

public class Chaudron {
   
	private int quantitePotion;
	private int forcePotion ;
	
	
   
	//Geters
	public int getQuantitePotion() {
		return quantitePotion;
	}
	
	public int getForcePotion() {
		return forcePotion;
	}
	
	//Seters
	public void setQuantitePotion(int q) {
		 quantitePotion=q;
	}
	
	//gyuyu
	public void remplirChaudron(int quantite ,int forcePotion) {
		quantitePotion=quantite;
		this.forcePotion=forcePotion;
	}
	
	public boolean  resterPotion () {
		if(quantitePotion==0) {
			return false;
		}else {
			return true;
		}
	}
	
	public int prendreLouche() {
		if (resterPotion () == true ){
			quantitePotion=quantitePotion-1;
		}else {
			forcePotion=0;	
		}
		return forcePotion;
	}
	
	
}

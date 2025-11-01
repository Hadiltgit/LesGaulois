package test_fonctionnel;

import personnages.*;
public class TestGaulois {

	public static void main(String[] args) {
		
		Gauloi asterix = new Gauloi("Astérix",8);
		Gauloi obelix = new Gauloi("Obélix",16);
		 
		asterix.parler("Bonjour Obélix.") ;
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?)") ;
		asterix.parler("Oui très bonne idée.") ;
		
		Romain minus = new Romain("Minus",6);
		Romain brutus = new Romain("Brutus",14);
		
		System.out.println("\" Dans la forêt "+asterix.getNom()+" et "+obelix.getNom()+" tombent nez à nez sur le romain "+minus.getNom());
		
		
		for(int i=0 ; i<=2 ; i++) {
			if(i != 2) {
				asterix.frapper(minus);
			}else {
				asterix.frapper(minus);
			}
		}
		
		
		Druide panoramix = new Druide("Panoramix",2);
		panoramix.fabriquerPotion(4 ,3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		
		
		for(int i=0 ; i<=2 ; i++) {
			if(i != 2) {
				asterix.frapper(brutus);
			}else {
				asterix.frapper(brutus);
			}
		}
	}
}

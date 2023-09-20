package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import personnages.Chef;

;

public class Scenario {
	public static void main(String[] args) {
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois asterix = new Gaulois("Astérix", 10);
		Romain minus = new Romain("Minus", 50);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller\r\n"
				+ "d'une force 5 à 10.");
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(6);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
		

		
		
	}
}

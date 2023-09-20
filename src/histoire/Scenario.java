package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import personnages.Chef;

;

public class Scenario {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 15);
		Romain minus = new Romain("Minus", 15);
		
		asterix.parler("Bonjour à tous");
		minus.parler(" UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

		
		
	}
}

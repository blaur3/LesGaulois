package personnages;

public class Village {
	private String nom;
	private int nbVillageoisMax;
	private Gaulois[] villageois;
	private Chef chef;
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.nbVillageoisMax = nbVillageoisMax;
		this.villageois = new Gaulois[nbVillageoisMax];
	}
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
		
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void afficherVillageois() {
		System.out.println("Le fabuleux" + nom + "compte parmi ses habitants : ");
		System.out.println("Le chef : " + chef);
		for(int i=0; i<nbVillageois; i++) {
			System.out.println(villageois[i]);
		}
	}
	
	
	public static void main(String args[]) {
		Village village = new Village("Village des Irréductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//Le tableau de villageois n'est pas initialisé
		
		//Chef abracourcix = new Chef("Abracourcix", 6, 0, "Village des Irréductibles");
		//Gaulois Asterix = new Gaulois("Astérix", 8);
		//village.ajouterHabitant(abracourcix);
		//village.ajouterHabitant(Asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//Il n'y a pas d'objet a cet indice
		
		Chef abracourcix = new Chef("Abracourcix", 6, 0, "Village des Irréductibles");
		Gaulois Asterix = new Gaulois("Astérix", 8);
		Gaulois Obelix = new Gaulois("Obelix", 8);
		village.chef = abracourcix;
		village.ajouterHabitant(Asterix);
		village.ajouterHabitant(Obelix);
		village.afficherVillageois();
		

		
	}
}

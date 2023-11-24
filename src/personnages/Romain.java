package personnages;

public class Romain {
	
	private String nom;
	private int force;
	Equipement[] equipements = new Equipement[2];
	int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		assert this.force > 0;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0;
		int forceini = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} 
		else {
			parler("J'abandonne...");
		}
		assert forceini> force;
	}
	
	private boolean eqpMax() {
	    return equipements[0] != null && equipements[1] != null;
	}
	
	public void sEquiper(Equipement eqp) {
	    if (!this.eqpMax()) {
	        for (int i = 0; i < 2; i++) {
	            switch (i) {
	                case 0:
	                case 1:
	                    if (equipements[i] == null) {
	                        equipements[i] = eqp;
	                        System.out.println("Le soldat s'equipe avec " + eqp);
	                    } else if (equipements[i] == eqp) {
	                        System.out.println("Le soldat possède déjà un " + eqp);
	                    }
	                    break;
	                default:
	                    break;
	            }
	        }
	    } else {
	        System.out.println("Le soldat " + nom + " est déjà bien protégé !");
	    }
	}
	
	public static void main(String[] args) {
		Romain Lulo = new Romain("Lullo", 6);
		Lulo.parler("jE SUIS LULO");
		Equipement myvar = Equipement.BOUCLIER ;
		System.out.println(myvar);
	}
		
	}

	
	

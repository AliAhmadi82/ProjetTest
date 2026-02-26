package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force, int effetPotion) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String txt) {

		System.out.println(prendreparole() + "\"" + txt + "\"");
	}

	private String prendreparole() {
		return "Le gaulois " + nom + " : ";
	}
}

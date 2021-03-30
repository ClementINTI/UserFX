package clement.userfx.model;

public class User {

	private String prenom;
	private String nom;

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void afficher() {
		System.out.println("Prénom : " + prenom);
		System.out.println("Nom : " + nom);
	}
}

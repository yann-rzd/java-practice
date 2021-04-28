package perenoel;

public class Jouet {
	
	String libelle;
	boolean dispo;
	
	public Jouet(String libelle) {
		this.libelle = libelle;
		dispo = true;
	}
	
	public void setNonDispo() {
		dispo = false;
	}
	
	public void afficherJouet() {
		System.out.println(libelle + " " + dispo);
	}
}
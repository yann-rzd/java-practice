package biblio;

public class Livre {	
	private int numIsbn;
	private String titre;
	private float prix;

	public Livre(int numIsbn, String titre, float prix) {
		super();
		this.numIsbn = numIsbn;
		this.titre = titre;
		this.prix = prix;
	}
	
	public int getNumIsbn() {
		return numIsbn;
	}

	public void setNumIsbn(int numIsbn) {
		this.numIsbn = numIsbn;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Numéro ISBN = " + numIsbn + ", titre = " + titre + ", prix = " + prix;
	}
	
}

package biblio;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class GestionBiblio {
	
	private Map<Integer, Livre> biblio = new HashMap<>();
	
	public void ajouterLivres(Livre livre) {
		if (livre != null && !biblio.containsKey(livre.getNumIsbn())) {
			biblio.put(livre.getNumIsbn(), livre);
		}
	}
	
	public void supprimerLivre(Livre livre) {
		if (livre != null && biblio.containsKey(livre.getNumIsbn())) {
			biblio.remove(livre.getNumIsbn());
		}
	}
	
	public int nbTotalLivres() {
		return biblio.size();
	}
	
	public float coutTotalLivre() {
		float total = 0.00f;
		
		Iterator<Entry<Integer, Livre>> it = biblio.entrySet().iterator();
		
		 while (it.hasNext())
	        { 
	        	   Entry<Integer, Livre> mapElement = it.next(); 
	        	   Livre livre = (Livre) mapElement.getValue(); // on récupère un objet de type Livre
	        	   total+=livre.getPrix(); // on ajoute le prix de chaque livre
	        } 
		 return total;
	}
	
	public Livre chercherLivre(Integer isbn) {
			if (isbn > 0 && biblio.get(isbn) != null)
				{
					return biblio.get(isbn);
				}
			return null;	
	}
	
	public void afficherLivres() {
		biblio.forEach((cle, valeur) -> System.out.println(cle + " : " + valeur));

	}

	public static void main(String[] args) {
		
		Livre livre1 = new Livre(1234, "titre1", 12.00f);
		Livre livre2 = new Livre(5678, "titre2", 15.00f);
		Livre livre3 = new Livre(1976, "titre3", 18.00f);
		
		GestionBiblio gestion = new GestionBiblio();
		gestion.biblio.put(livre1.getNumIsbn(), livre1);
		gestion.biblio.put(livre2.getNumIsbn(), livre2);
		gestion.biblio.put(livre3.getNumIsbn(), livre3);
		
		System.out.println("1. Recherche du livre 2 avec l'ISBN 5678\n");
		
		System.out.println(gestion.chercherLivre(5678));
		
		System.out.println("2. Montant total des livres en biblio = "+ gestion.coutTotalLivre()+ " euros");
		
		System.out.println("3. Nombre de livres en biblio = "+ gestion.nbTotalLivres());
		
		System.out.println("4. Ajout du livre 4 (9876, Titre4, 18.00 euros) ");
		gestion.ajouterLivres(new Livre(9876, "Titre4",18.00f));
		
		System.out.println("5. Liste de tous les livres");
		gestion.afficherLivres();
		
		System.out.println("6. Nouveau montant total des livres en biblio = "+ gestion.coutTotalLivre()+ " euros");
		
		System.out.println("7. Nouveau nombre de livres en biblio = "+ gestion.nbTotalLivres());
		
		System.out.println("8. Liste de tous les livres");		
		gestion.afficherLivres();
		
		System.out.println("9. suppression du livre avec l'ISBN 5678");		
		gestion.supprimerLivre(gestion.chercherLivre(5678));
		
		System.out.println("10. Liste de tous les livres");		
		gestion.afficherLivres();

	}

}

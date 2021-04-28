package perenoel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		PereNoel papaNono = new PereNoel();
		
		Jouet joujou1 = new Jouet("Ferrari 308GTB");
		Jouet joujou2 = new Jouet("BarbiZou la poupée qui gazouille");
		Jouet joujou3	= new Jouet("Super puzzle avec 180 pièces");
		Jouet joujou4 = new Jouet("Mikado");
		Jouet joujou5 = new Jouet("Rubik's Cube");
		Jouet joujou6	= new Jouet("iPad");

		Enfant nono = new Enfant("Bidule","Noémie",8);
		Enfant jojo = new Enfant("Machin","Joachim",6);
		Enfant souf = new Enfant("Truc","Soufiane",9);
		Enfant doublon = new Enfant("Bidule","Noémie",8);
		
		papaNono.ajouterJouet(joujou1);
		papaNono.ajouterJouet(joujou2);
		papaNono.ajouterJouet(joujou3);
		papaNono.ajouterJouet(joujou4);
		papaNono.ajouterJouet(joujou5);
		papaNono.ajouterJouet(joujou6);
		
		papaNono.ajouterEnfant(nono);
		papaNono.ajouterEnfant(jojo);
		papaNono.ajouterEnfant(souf);
		
		papaNono.afficherListeDesEnfants();
		papaNono.afficherListeDesJouets();
		
		papaNono.distribuer(nono,joujou1);
		papaNono.distribuer(jojo, joujou2);
		papaNono.distribuer(souf,joujou3);
		papaNono.distribuer(souf,joujou4);
		papaNono.distribuer(nono,joujou5);
		papaNono.distribuer(jojo,joujou6);

		nono.afficher();
		jojo.afficher();
		souf.afficher();

		papaNono.distribuer(nono,joujou2);

	}

}

class PereNoel {
	Set<Jouet> jouets;
	Set<Enfant> enfants;
	Iterator iter;
	
	public PereNoel() {
		jouets = new HashSet<Jouet>();
		enfants = new HashSet<Enfant>();
	}
	
	public void ajouterJouet(Jouet jouet) {
		jouets.add(jouet);
	}
	
	public void ajouterEnfant(Enfant enfant) {
		enfants.add(enfant);
	}
	
	public void distribuer(Enfant enfant, Jouet jouet) {
		jouets.remove(jouet);
		
		if (jouet.dispo) {
			enfant.addJouet(jouet);
			jouet.setNonDispo();
		} else {
			System.out.println("Le jouet " + jouet.libelle + " n'est plus disponinle.");
		}
	}
	
	public void afficherListeDesEnfants() {
		iter = enfants.iterator();
		
		while (iter.hasNext()) {
			Enfant enf = (Enfant)iter.next();
			System.out.println(enf.nom + " " + enf.prenom);
		}
	}
	
	public void afficherListeDesJouets() {
		if (jouets.size() == 0) {
			System.out.println("Il n'y a plus de jouets ...");
		}
		
		iter = jouets.iterator();
		
		while (iter.hasNext()) {
			Jouet jouet = (Jouet)iter.next();
			System.out.println(jouet.libelle);
		}
	}
	
	public void afficher() {
		iter = enfants.iterator();
		
		while (iter.hasNext()) {
			Enfant enf=(Enfant) iter.next();
			enf.afficher();
		}
	}
	
	
}

package heritagepolymorphisme;

import heritagepolymorphisme.Apprenant.Os;

public class TestHeritage {
	public static void main(String[] args) {

		Apprenant phil = new Apprenant("Philippe",54,"Montreuil", Os.WINDOWS);

		phil.bonjour();
		phil.travailler();
		phil.manger("banane");
		phil.chomer();
		phil.dormir();

		Personne jojo = new Personne("Josselin",34);

		jojo.bonjour();
		jojo.manger("pizza");
		jojo.dormir();

		Personne anissa = new Apprenant("Anissa",23, "Montreuil",Os.MAC);
		anissa.bonjour();
		anissa.manger("chocolat");
		anissa.dormir();
	}
}

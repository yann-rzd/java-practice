package analyserPhrase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chaine {
	
	String maChaine;
	int nbVoyelles;
	int nbConsonnes;
	int nbEspaces;
	int nbLettres;
	int nbMots;
	
	public Chaine() {
		
	    System.out.println("Donnez une suite de mots puis validez (entrée)");
	    
	    try {
	    	
	        InputStreamReader entree = new InputStreamReader(System.in);
	        BufferedReader clavier = new BufferedReader(entree);
	        maChaine = clavier.readLine();
	        
	    } catch(IOException e) {
	    	
	        System.out.println("Problème de lecture en entrée !");        
	    }
	}
	
	public void extraire() {
		
		char lettre;
		String listVoyelles = "AEIOUYaeiouyàéîïôûyèâ";
		String listCaracSpeciaux = "*!:;,&#'(-è_çà)=+-_987654321%$";
		
		for (int i = 0; i < maChaine.length(); i++) {
			
			lettre = maChaine.charAt(i);
			
			if (Character.isLetter(lettre)) {
				
				if (listVoyelles.indexOf(lettre) > -1) {
					
					nbVoyelles++;
					
				} else {
					
					nbConsonnes++;
					
				}
				
			} else if (Character.isWhitespace(lettre)) {
				
				nbEspaces++;
			}
			
			if (listCaracSpeciaux.indexOf(lettre) < 0) {
				
				nbLettres++;
			}
		}
		
		StringTokenizer chaineMots = new StringTokenizer(maChaine);
		nbMots = chaineMots.countTokens();
	}
	
	public String toString() {
		
		return maChaine;
	}
	
	public void afficher() {
		
		System.out.println("Voici ma chaîne : " + maChaine);
		System.out.println("Voici le nombre de voyelles : " + nbVoyelles);
		System.out.println("Voici le nombre de consonnes : " + nbConsonnes);
		System.out.println("Voici le nombre d'espaces : " + nbEspaces);
		System.out.println("Voici le nombre de lettres : " + (nbLettres - nbEspaces));
		System.out.println("Voici le nombre de mots : " + nbMots);
		
	}
	
	public static void main(String args[]) {
		Chaine unechaine = new Chaine();
		unechaine.extraire();
		unechaine.afficher();
	}
}

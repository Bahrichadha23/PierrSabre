package histoire;

import personnages.Humain;


public class HistoireTP4 {
	String nom;
	public static void main(String[] argv) {
		System.out.println("texte");
		Humain prof =new Humain( "prof", "Kombucha", 54);
		prof.direBonjour();
		prof.boire();
		prof.acheter("jeu",2);
	}

}

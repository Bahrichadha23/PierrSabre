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
		Commercant proff=new Commercant()
		Commercant marco = new Commercant("Marco", 20);
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
        marco.direBonjour();
        yakuLeNoir.direBonjour();
        yakuLeNoir.extorquer(marco);
        marco.recevoir(15);
        marco.boire();
        Commercant marco = new Commercant("Marco", 20);
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
        Ronin roro = new Ronin("Roro", 60);

        roro.direBonjour();
        roro.donner(marco);
        Ronin roro = new Ronin("Roro", 60);
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong", 0); // Réputation initialement à 0

        roro.direBonjour();
        roro.provoquer(yakuLeNoir);
        yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 4); // Réputation à 4
        roro = new Ronin("Roro", 60); 

        roro.provoquer(yakuLeNoir);
	}

}

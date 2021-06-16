package com.atexo.cartes;

public class Ditribiteur {
	
	public static void main(String[] args) {
		
		Paquet paquet = new Paquet();
		paquet.remplir();
		paquet.melanger();
		System.out.println("**** La main NON triée ****");
		paquet.afficher();
		System.out.println("\n");
		System.out.println("**** La main triée par valeur ****");
		paquet.trierParValeur();
		System.out.println("\n");
		System.out.println("**** La main triée par Couleur ****");
		paquet.trierParCouleur();
		System.out.println("\n");
		System.out.println("La Taille de la main est:"+" "+paquet.getNombreCarte());
	}

}

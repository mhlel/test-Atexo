package com.atexo.cartes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {
	
	//les cartes qui se trouvent dans la main
	protected ArrayList<Carte> main = new ArrayList<Carte>();
	
	//Ajouter une methode à la main
	
	public void ajouter(Carte carte) {
		main.add(carte);
	}
	
	//Jouer Une carte: on prend une carte et on va l'ajouter dans une autre main
	public void jouerCarte(Carte carte, Main autreMain) {
		autreMain.ajouter(carte);
		main.remove(carte);
	}
	
	//Vider une main
	public void vider() {
		main.clear();
	}
	
	// savoir le nombre de carte dans une main
	
	public int getNombreCarte() {
		return main.size();
	}
	
	// savoir si une main contient une couleur
	public boolean contientCouleur(Couleur couleur){
		boolean contient = false;
		for(Carte c:main) {
			if(c.getCouleur().getNom().equals(couleur.getNom())) {
				contient=true;
			}
			else {
				contient=false;
			}
		}
		return contient;
	}

	public ArrayList<Carte> getMain() {
		return main;
	}

	public void setMain(ArrayList<Carte> main) {
		this.main = main;
	}
	
	public void afficher() {
		System.out.println(main);
	}
	
//	public void trier() {
//		Map<Couleur, Integer> map = new HashMap<>();
//		
//		 
//		for(Carte c:main) {
//			map.put(c.getCouleur(), c.getValeur().getValeur());
//			
//		}
////		System.out.println("Avant le tri: "+map);
////        map_apres.putAll(map);
//        System.out.println(map);
//	}
	
	

	
}

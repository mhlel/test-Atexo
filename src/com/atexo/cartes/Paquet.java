package com.atexo.cartes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Paquet extends Main {
	public void remplir() {
		for(Couleur couleur: Couleur.values()) {
			for(Valeur valeur: Valeur.values()) {
				//Map<Couleur, Valeur> map = new HashMap<>();
				Carte carte = new Carte(couleur, valeur);
				//map.put(couleur, valeur);
				carte.tourner();
				ajouter(carte);
			}
		}
	}
	
	public void melanger() {
		Collections.shuffle(main);
	}
	
//	public void trier() {
//		List<Integer> liste = new ArrayList();
//		for (Iterator iterator = main.iterator(); iterator.hasNext();) {
//		Carte carte = (Carte) iterator.next();
//		int val=carte.getValeur().getValeur();
//		
//		liste.add(val);
//	}
//		Collections.sort(liste);
//		System.out.println(liste);
//		for (Iterator iterator = liste.iterator(); iterator.hasNext();) {
//			Integer element = (Integer) iterator.next();
//			element.get
//		}
//	}
	
	public void trierParValeur() {
				
		Collections.sort(main, new SortbyValuer());
		System.out.println(main);
		
	}
	
	public void trierParCouleur() {
		
		Collections.sort(main, new SortByCouleur());
		System.out.println(main);
		
	}
	
	

}

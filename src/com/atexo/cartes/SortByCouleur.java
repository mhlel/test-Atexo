package com.atexo.cartes;

import java.util.Comparator;

public class SortByCouleur implements Comparator<Carte> {

	public int compare(Carte a, Carte b) {
		return a.getCouleur().getNom().compareTo(b.getCouleur().getNom());
	}


}

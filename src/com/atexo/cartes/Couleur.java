package com.atexo.cartes;

public enum Couleur {
	
	CARREAUX("Carreux"),
	COEUR("Coeur"),
	PIQUE("Pique"),
	TREFLE("Trefle");
	private final String nom;
	
	private Couleur(String nom) {
		this.nom =nom;
	}

	public String getNom() {
		return nom;
	}
	
	

}

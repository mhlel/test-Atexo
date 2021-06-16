package com.atexo.cartes;

public enum Valeur {
	AS(1),
	DEUX( 2),
	TROIS( 3),
	QUATRE( 4),
	CINQ( 5),
	SIX( 6),
	SEPT( 7),
	HUIT( 8),
	NEUF( 9),
	DIX( 10),
	VALET( 11),
	DAME( 12),
	ROI( 13);
	
	//private final String nom;
	private final int valeur;
	
	private Valeur(int valeur) {
		//this.nom=nom;
		this.valeur=valeur;
}

//	public String getNom() {
//		return nom;
//	}

	public int getValeur() {
		return valeur;
	}
	
	
	

}

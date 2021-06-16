package com.atexo.cartes;

public class Carte {
	//Les Variables
	
	private Couleur couleur;
	private Valeur valeur;
	private boolean affiché;
	
	public Carte(Couleur couleur, Valeur valeur) {
		this.couleur=couleur;
		this.valeur=valeur;
		affiché=false;
	}

	
	//Les getters
	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Valeur getValeur() {
		return valeur;
	}

	public void setValeur(Valeur valeur) {
		this.valeur = valeur;
	}

	public boolean isAffiche() {
		return affiché;
	}

	public void setAffiche(boolean affiché) {
		this.affiché = affiché;
	}
	
	//methode pour tourner la carte
	
	public void tourner() {
		affiché=!affiché;
	}
	
	//redefinition de la methode toString() pour afficher la carte
	
	@Override
	public String toString() {
		String affichage;
		if(affiché)
			affichage=  valeur.getValeur()+" "+ "de"+" " +couleur.getNom();
		else
			affichage=("La carte est sur son dos, je ne sais pas sa couleur et sa valeur");
		return affichage;
	}
	
	

}

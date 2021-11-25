package main;

/**
 * Write a description of class Bateau here.
 *
 * @author Berenger, Renard
 * @version v1
 */

public class Bateau {
	private String nom;
	private double prix;
	private ConcessionnaireBateau concessionnaireBateau;

	public Bateau() {
		// initialise instance variables
		this.nom = "";
		this.prix = 0;
	}

	public Bateau(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {
		return this.nom;
	}

	public double getPrix() {
		return this.prix;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public ConcessionnaireBateau getConcessionnaireBateau() {
		return concessionnaireBateau;
	}

	public void setConcessionnaireBateau(ConcessionnaireBateau concessionnaireBateau) {
		this.concessionnaireBateau = concessionnaireBateau;
	}
	
	
}

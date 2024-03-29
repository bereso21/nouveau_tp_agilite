package main;

import factory.Personne;
/**
 * Write a description of class Bateau here.
 *
 * @author Berenger, Renard
 * @version v1
 */

public class Marin extends Personne implements IBateau {

	private boolean proprietaireBateau;
	private int age;
	private double portefeuille;
	private Bateau bateau;

	public Marin() {
		this.proprietaireBateau = false;
		this.portefeuille = 0.0;
	}
	
	public Marin(int age) {
		this.proprietaireBateau = false;
		this.portefeuille = 0.0;
		this.age = age;
	}

	public boolean peutNaviguer() {
		if(this.proprietaireBateau == false) 
			return false;
		else   
			return true;
	}
	
	@Override
	public void addBateau(Bateau bateau) {
		// TODO Auto-generated method stub
		if(bateau.getPrix() > this.portefeuille) {
			System.out.println("Vous n'avez pas assez d'argent pour acheter le bateau "+bateau.getNom()+".");
		}
		else {

			transactionBateau(bateau);

			System.out.println("Achat effectué de votre bateau "+bateau.getNom()+"! Il vous reste "+this.portefeuille+" euros.");
		}

	}

	public String achatBateau(Bateau bateau) {
		if(bateau.getPrix() > this.portefeuille) {
			System.out.println("Vous n'avez pas assez d'argent");
			return "Vous n'avez pas assez d'argent";
		}
		else {
			
			transactionBateau(bateau);
			
			System.out.println("Achat effectué de votre bateau "+bateau.getNom()+"! Il vous reste "+this.portefeuille+" euros.");
			return "Achat effectué";
		}
	}

	public void transactionBateau(Bateau bateau) {
		if(this.portefeuille > bateau.getPrix()) {
			this.portefeuille = this.portefeuille - bateau.getPrix();
			this.proprietaireBateau = true;
			this.bateau = bateau;
			
			ConcessionnaireBateau concessionnaireBateau = bateau.getConcessionnaireBateau();
			if(concessionnaireBateau != null) {
				concessionnaireBateau.suppressionBateau(bateau);
			}
		} else {
			System.out.println("Pas assez d'argent");
		}
		
		
	}

	public boolean isProprietaireBateau() {
		return proprietaireBateau;
	}

	public void setProprietaireBateau(boolean proprietaireBateau) {
		this.proprietaireBateau = proprietaireBateau;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPortefeuille() {
		return portefeuille;
	}

	public void setPortefeuille(double portefeuille) {
		this.portefeuille = portefeuille;
	}

	public Bateau getBateau() {
		return bateau;
	}

	public void setBateau(Bateau bateau) {
		this.bateau = bateau;
	}



}

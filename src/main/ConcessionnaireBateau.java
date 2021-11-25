package main;

import java.util.ArrayList;

public class ConcessionnaireBateau {

	private String nom; 
	private ArrayList<Bateau> bateaux;

	public ConcessionnaireBateau() {
		this.nom = "";
		this.bateaux = new ArrayList<Bateau>();
	}

	public ConcessionnaireBateau(String nom) {
		this.nom = nom;
		this.bateaux = new ArrayList<Bateau>();
	}

	public void ajoutBateau(Bateau bateau) {
		this.bateaux.add(bateau);
		bateau.setConcessionnaireBateau(this);
	}

	public void suppressionBateau(Bateau bateau) {
		int index = -1;
		
		for(int i = 0; i < this.bateaux.size(); i++) {
			Bateau b = this.bateaux.get(i);
			
			if(b.getNom().equals(bateau.getNom()) && b.getPrix() == bateau.getPrix()) {
				index = i;
			}
			
		}

		if(index != -1) {
			this.bateaux.remove(index);
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Bateau> getBateaux() {
		return bateaux;
	}

	public void setBateaux(ArrayList<Bateau> bateaux) {
		this.bateaux = bateaux;
	}



}

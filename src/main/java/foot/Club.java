package foot;

import java.util.ArrayList;
import sponsor.Sponsor;

public class Club {
	 
    private String nomClub;
    ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
    Joueur capitaine;
    private Sponsor sponsor;


    public Club(String nomJoueur, ArrayList<Joueur> joueurs)
    {
        this.nomClub = this.detectNomClub(nomJoueur);
        this.joueurs=joueurs;
    }
    
    public String getNomClub () {
        return this.nomClub;
    }
    
    public ArrayList<Joueur> getJoueurs(){
    	return joueurs;
    }
    
    
    public void setNomClub (String nouveauNomClub) {
        this.nomClub = nouveauNomClub;
    }
    
//    public Joueur ajouterJoueur(Joueur j) {
//    	return addJoueur(j);
//    }
//
//	public Joueur addJoueur(Joueur j) {
//		this.joueurs.add(j);
//    	return j;
//	}

    
    // connaitre le nom du club à partir du nom du joueur
    public String detectNomClub(String nomJoueur)
    {
        switch (nomJoueur) {
         case "Benzema":
             this.setNomClub("Real Madrid");
             break;
         case "Ronaldo":
             this.setNomClub("Man united");
             break;
         case "Messi":
             this.setNomClub("PSG");
             break;
         default:
             this.setNomClub("Autre");
        }
		return nomClub;
    }
    
    // affecter le statut de capitaine à un joueur
    public Joueur Capitaine (Joueur joueur) {
    	if(capitaine==null) {
    		return this.capitaine=joueur;
    	}
    	return capitaine;
    }
    
    public void setSponsor(Sponsor sponsor) {
    	this.sponsor = sponsor;
    }
    
    public Sponsor getSponsor() {
    	if(this.sponsor!=null) {
    		return this.sponsor;
    	} else {
    		System.out.println("Ce club n'a pas de sponsor");
    		return null;
    	}
    }
}

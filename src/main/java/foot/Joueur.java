package foot;

import factory.Personne;
/**
 * @author AGOUZZAL & LECHLECH 
 * @version 1.1
 */

public class Joueur extends Personne{

    // variable d'instance indiquant le nom du joueur
    private String nomJoueur;
    // variable d'instance indiquant le numéro du joueur
    private int numJoueur;
    // variable d'instance indiquant le poste du joueur
    private String posteJoueur;
    // variable d'instance indiquant que le joueur a un club
    private Club club;

    /**
     * Constructeur d'objets de classe Joueur
     */
    public Joueur()
    {
        // initialisation des variables d'instance
        nomJoueur = "null";
        numJoueur = 0;
        posteJoueur = "null";
        club = new Club (nomJoueur, null);
    }

    public String getNomJoueur(){
        return this.nomJoueur;
    }
    
    public int getNumJoueur(){
        return this.numJoueur;
    }    
    
    public String getPosteJoueur(){
        return this.posteJoueur;
    }
    
    public String getNomClub(){
        this.club.detectNomClub(this.nomJoueur);
        return this.club.getNomClub();
    }
    
    
    public void setNomJoueur(String nouveauNom){
        this.nomJoueur = nouveauNom;
        //this.club.detectNomClub(this.nomJoueur); 
    }
    
    public void setNumJoueur(int nouveauNum){
        this.numJoueur = nouveauNum;
    }    
    
    public void setPosteJoueur(String nouveauPoste){
        this.posteJoueur = nouveauPoste;
    }
    

    // méthode pour changer le poste d'un joueur
    public void changerPoste (int nouveauNum, String nouveauPoste)
    {
        this.setNumJoueur(nouveauNum);
        this.setPosteJoueur(nouveauPoste);
    }
    
    
    // méthode pour savoir si un joueur est capitaine
    public boolean isCapitain (Joueur joueur) {
    	if(joueur==club.Capitaine(joueur)) {
    		return true;
    	}
		return false;	
    }

	}

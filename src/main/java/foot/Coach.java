package foot;

import factory.Personne;

public class Coach extends Personne{
	
	Club club;
	String nomCoach;
	
	public Coach() {
		this.club = new Club("", null);
		this.nomCoach = "";
	}
	
	public void setClub(Club club) {
		this.club = club;
	}
	
	public Club getClub() {
		return this.club;
	}
	
	public Coach(Club club, String nomCoach) {
		this.club = club;
		this.nomCoach = nomCoach;
	}

	public void virerUnJoueur(Joueur joueur) {
		int index = 0;
		for(int i = 0; i < this.club.joueurs.size();i++) {
			if(this.club.joueurs.get(i).equals(joueur)) index = i;
		}
		
		this.club.joueurs.remove(index);
	}
	
	public void ajouterUnJoueur(Joueur joueur) {
		club.joueurs.add(joueur);
	}

}
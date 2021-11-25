package main;

public class Coach {
	
	Club club;
	String nomCoach;
	
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
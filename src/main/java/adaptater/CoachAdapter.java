package adaptater;

import foot.Coach;
import foot.Joueur;

public class CoachAdapter implements IAction{
	
	private Coach coach;
	
	public CoachAdapter(Coach coach) {
		this.coach = coach;
	}

	@Override
	public void ajouter(Object o) {
		// TODO Auto-generated method stub
		this.coach.ajouterUnJoueur((Joueur) o);
		
	}

	@Override
	public void suppression(Object o) {
		// TODO Auto-generated method stub
		this.coach.virerUnJoueur((Joueur) o);
		
	}
	
	public Coach getCoach() {
		// TODO Auto-generated method stub
		return this.coach;
		
	}

}

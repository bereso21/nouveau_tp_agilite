package adaptater;

import foot.Coach;

public class CoachAdapter implements IAction{
	
	private Coach coach;
	
	public CoachAdapter(Coach coach) {
		this.coach = coach;
	}

	@Override
	public void ajouter(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suppression(Object o) {
		// TODO Auto-generated method stub
		
	}

}

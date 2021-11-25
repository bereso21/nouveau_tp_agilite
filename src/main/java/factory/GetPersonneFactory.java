package factory;

import foot.Coach;
import foot.Joueur;
import main.Marin;

public class GetPersonneFactory {
	
	public Personne getPersonne(String personneType) {
		if(personneType == null) {
			return null;
		}
		if(personneType.equalsIgnoreCase("Marin")) {
			return new Marin();
		}
		else if(personneType.equalsIgnoreCase("Joueur")) {
			return new Joueur();
		}
		else if(personneType.equalsIgnoreCase("Coach")) {
			return new Coach();
		}
		
		return null;
	}

}

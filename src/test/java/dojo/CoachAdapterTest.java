package dojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

import sponsor.Sponsor;
import foot.Coach;
import adaptater.CoachAdapter;
import foot.Joueur;
import foot.Club;


public class CoachAdapterTest {
	Coach coach;
	CoachAdapter coachAdpt;
	Joueur joueur1;
	Joueur joueur2;
	ArrayList<Joueur> compo1;
	ArrayList<Joueur> compo2;
	Club club;
    
    public CoachAdapterTest() {
    }

    @Before
    public void setUp() throws Exception {
    	
    	this.joueur1 = new Joueur();
    	this.joueur2 = new Joueur();
    	this.compo1 = new ArrayList<Joueur>();
    	this.compo2 = new ArrayList<Joueur>();
    	compo1.add(joueur2);
    	compo2.add(joueur1);
    	compo2.add(joueur2);
    	this.club = new Club("Nom du Club", compo1);
    	this.coach = new Coach(club, "Nom Coach");
    	this.coachAdpt = new CoachAdapter(coach);
    }

    @org.junit.Test
    public void testAjouter() {
    	this.coachAdpt.ajouter(joueur1);
    	assertTrue(compo2.size() == coachAdpt.getCoach().getClub().getJoueurs().size() && compo2.containsAll(coachAdpt.getCoach().getClub().getJoueurs()) && coachAdpt.getCoach().getClub().getJoueurs().containsAll(compo2));
    }

    @org.junit.Test
    public void testSupprimer() {
    	this.compo2.remove(joueur2);
    	this.coachAdpt.ajouter(joueur1);
    	this.coachAdpt.suppression(joueur2);
        assertTrue(compo2.size() == coachAdpt.getCoach().getClub().getJoueurs().size() && compo2.containsAll(coachAdpt.getCoach().getClub().getJoueurs()) && coachAdpt.getCoach().getClub().getJoueurs().containsAll(compo2));
    }
}

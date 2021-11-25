package dojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

import sponsor.Sponsor;
import foot.Coach;
import adaptater.CoachAdapter;
import factory.GetPersonneFactory;
import foot.Joueur;
import foot.Club;
import main.Marin;

public class GetPersonneFactoryTest {
	Coach coach;
	Marin marin;
	Joueur joueur;
	GetPersonneFactory gpf;
    
    public GetPersonneFactoryTest() {
    }

    @Before
    public void setUp() throws Exception {
    	this.coach = new Coach();
    	this.marin = new Marin();
    	this.joueur = new Joueur();
    	this.gpf = new GetPersonneFactory();
    }
    
    @org.junit.Test
    public void testTypePersonneCoach() {
    	assertEquals(coach.getClass(), gpf.getPersonne("Coach").getClass());
    }
    
    @org.junit.Test
    public void testTypePersonneMarin() {
    	assertEquals(marin.getClass(), gpf.getPersonne("Marin").getClass());
    }
    
    @org.junit.Test
    public void testTypePersonneJoueur() {
    	assertEquals(joueur.getClass(), gpf.getPersonne("Joueur").getClass());
    }
    
}

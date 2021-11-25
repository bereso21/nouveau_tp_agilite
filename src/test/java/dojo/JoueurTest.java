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


public class JoueurTest {

    private Joueur j = new Joueur();
    Club c = new Club();
    ArrayList<Joueur> compo = new ArrayList<>();
    ArrayList<Joueur> a = new ArrayList<>();

    /**
     * Met en place les engagements.
     * Méthode appelée avant chaque appel de méthode de test.
     */
    
    @Before
    public void setUp() throws Exception
    {
        // Initialisation des engagements
    }

    /**
     * Supprime les engagements
     * Méthode appelée après chaque appel de méthode de test.
     */
   
    @Test
    public void testChangePoste()
    {
    	compo.add(j);
    	this.c.setJoueurs(compo);
    	j.changerPoste(7, "MDf");
        assertEquals(7, j.getNumJoueur());
        assertEquals("MDf", j.getPosteJoueur());
    }
    
    @Test
    public void testCapitain()
    {
    	c.setJoueurs(compo);
    	c.Capitaine(j);
        assertEquals(true, j.isCapitain(j));
    }
    
}

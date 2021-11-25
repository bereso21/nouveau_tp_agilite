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

public class CoachTest {
	
	private Joueur j1= new Joueur();
	private Joueur j2= new Joueur();
	private ArrayList<Joueur> compo= new ArrayList<Joueur>();
	private ArrayList<Joueur> compoExp= new ArrayList<Joueur>();
	private Club cl= new Club();; 
	private Coach co= new Coach();
	
	

	
    @Before
    public void setUp() throws Exception {     
    }
    
    @Test
    public void testVirerJoueur()
    {
        compoExp.add(j1);
    	compo.add(j1);
        compo.add(j2);
        cl.setJoueurs(compo);
        co.setClub(cl);
        
        co.virerUnJoueur(j2);
        assertEquals(cl.getJoueurs(), compoExp);
    }
    
    @Test
    public void testAjouterJoueur()
    {
        compoExp.add(j1);
    	compo.add(j1);
        compo.add(j2);
        cl.setJoueurs(compo);
        co.setClub(cl);
        
    	compoExp.add(j2);
    	compoExp.add(j1);
        co.ajouterUnJoueur(j1);
        assertTrue(compoExp.size() == co.getClub().getJoueurs().size() && compoExp.containsAll( co.getClub().getJoueurs()) &&  co.getClub().getJoueurs().containsAll(compoExp));
    }

}

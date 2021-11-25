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


public class ClubTest
{
    private Joueur j;
    private Club c;
    private ArrayList<Joueur> compo;
    

    
    @Before
    public void setUp() throws Exception
    {
        this.j = new Joueur();
        this.compo = new ArrayList<Joueur>();
        compo.add(j);
        this.c = new Club(); 
        c.setJoueurs(compo);
    }
    
    
    @Test
    public void NomClubTest()
    {
        this.j.setNomJoueur("Ronaldo");
        assertEquals("Man united", this.j.getNomClub());
    }    
    
}


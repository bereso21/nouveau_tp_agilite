package dojo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import main.Bateau;
//import main.Marin;

public class BateauTest {
    
    public BateauTest()
    {
    }

    @Before
    public void setUp() throws Exception {
        
    }

    @Test
    public void testSetBateau()
    {
        Bateau bateau2 = new Bateau();
        bateau2.setNom("Saphir");
        bateau2.setPrix(1000);
    }

    @Test
    public void testGetBateau()
    {
        Bateau bateau1 = new Bateau();
        assertEquals("", bateau1.getNom());
        assertEquals(0, bateau1.getPrix(), 0.1);
    }
}

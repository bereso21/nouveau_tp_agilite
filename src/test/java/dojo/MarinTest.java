package dojo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import main.Bateau;
import main.Marin;


public class MarinTest {
    private Marin marin1;

    public MarinTest()
    {
    }

 
    @Before
    public void setUp() throws Exception {
        this.marin1 = new Marin();
    }


    @Test
    public void testGetAge()
    {
        Marin christophe = new Marin();
        christophe.setAge(35);
        assertEquals(35, christophe.getAge());
    }

    @Test
    public void testProprioBateau()
    {
        Marin christophe = new Marin();
        Bateau bateau = new Bateau("Bateau Test", 1000);
        String resultat = christophe.achatBateau(bateau);
    }

    @Test
    public void testAchatBateau()
    {
        this.marin1 = new Marin();
        Bateau bateau = new Bateau("Bateau Test", 1000);
        marin1.achatBateau(bateau);
    }

    @Test
    public void testPeutNaviger()
    {
        this.marin1 = new Marin();
        assertEquals(false, marin1.peutNaviguer());
    }
    
	@Test
    public void testGetPortefeuille() {
        Marin christophe = new Marin(23);
        christophe.setPortefeuille(3000);
        assertEquals(3000, christophe.getPortefeuille(), 0);
    }
}

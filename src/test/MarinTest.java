package test.unitaire;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

import main.Bateau;
import main.Marin;

/**
 * The test class MarinTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MarinTest
{
	private Marin christopher;
	private Bateau blackpearl;

	/**
	 * Default constructor for test class MarinTest
	 */
	public MarinTest() {

	}

	@Before
	public void setUp() {
		christopher = new Marin();
		blackpearl = new Bateau("BlackPearl", 100);
		christopher.setPortefeuille(200);
	}

	@After
	public void tearDown() {

	}

	@org.junit.Test
	public void testGetAge() {
		christopher.setAge(35);
		assertEquals(35, christopher.getAge());
	}

	@org.junit.Test
	public void testProprietaireBateau() {
		//Marin christophe = new Marin();
		assertEquals(false, christopher.isProprietaireBateau());
	}

	@org.junit.Test
	public void testAchatBateau() {
		boolean isPossible = false;
		if(christopher.getPortefeuille() >= blackpearl.getPrix()) {
			isPossible = true;
		}
			
		christopher.achatBateau(blackpearl);
		
		assertEquals(isPossible, christopher.isProprietaireBateau());
		
	}



	@org.junit.Test
	public void testPeutNaviguer() {
		Marin christophe = new Marin();
		assertEquals(false, christophe.peutNaviguer());
	}
}





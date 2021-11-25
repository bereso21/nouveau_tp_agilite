package test.unitaire;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;


/**
 * The test class BateauTest.
 *
 * @author  Berenger, Renard
 * @version v1
 */
public class BateauTest
{
	/**
	 * Default constructor for test class BateauTest
	 */
	public BateauTest() {

	}

	/**
	 * Sets up the test fixture.
	 *
	 * Called before every test case method.
	 */
	@Before
	public void setUp() {
		blackpearl = new Bateau("BlackPearl", 100);
	}

	/**
	 * Tears down the test fixture.
	 *
	 * Called after every test case method.
	 */
	@After
	public void tearDown() {
		
	}
	
	@org.junit.Test
	public void testGetPrix() {
		blackpearl.setPrix(200);
		assertEquals(200, blackpearl.getPrix());
	}
}

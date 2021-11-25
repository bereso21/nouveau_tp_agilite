package dojo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Bateau;
import main.ConcessionnaireBateau;

public class ConcessionnaireBateauTest {
	private Bateau blackpearl;
	private Bateau saphir;
	private ConcessionnaireBateau mecaseine;

	@Before
	public void setUp() throws Exception {
		this.blackpearl = new Bateau("Blackpearl", 1000);
		this.saphir = new Bateau("Saphir", 5000);
		this.mecaseine = new ConcessionnaireBateau("MecaSeine");
	}

	
	@Test
	public void testAjoutBateau() {
		this.mecaseine.ajoutBateau(blackpearl);
		this.mecaseine.ajoutBateau(saphir);
		
		ArrayList<Bateau> bateauTest = new ArrayList<Bateau>();
		bateauTest.add(blackpearl);
		bateauTest.add(saphir);
		
		assertEquals(mecaseine.getBateaux(), bateauTest);
	}
}

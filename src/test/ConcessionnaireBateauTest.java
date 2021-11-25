package test.unitaire;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
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
		blackpearl = new Bateau("BlackPearl", 1000);
		saphir = new Bateau("Saphir", 5000);
		mecaseine = new ConcessionnaireBateau("Mecaseine");
	}

	@Test
	public void testAjoutBateau() {
		this.mecaseine.ajoutBateau(blackpearl);
		this.mecaseine.ajoutBateau(saphir);
		
		ArrayList<Bateau> bateauxTest = new ArrayList<Bateau>();
		bateauxTest.add(blackpearl);
		bateauxTest.add(saphir);
		
		assertEquals(Collections.unmodifiableList(bateauxTest), Collections.unmodifiableList(this.mecaseine.getBateaux()));
	}

	//@Test
	//public void testSuppressionBateau() {

	//}

}

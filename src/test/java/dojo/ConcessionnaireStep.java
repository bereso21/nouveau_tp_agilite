package dojo;  

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Assert;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import main.Marin;
import main.Bateau;
import main.ConcessionnaireBateau;

public class ConcessionnaireStep {
	private ConcessionnaireBateau Boatrental;
	private Bateau bateau1;
	private Bateau bateau2;
	
	@Given("Deux bateau (.*) et (.*)")
	public void il_y_a_deux_bateau(String nom1, String nom2) {
		this.bateau1 = new Bateau();
		this.bateau2 = new Bateau();
		this.bateau1.setNom(nom1);
		this.bateau2.setNom(nom2);
	}
	@And("Ils ont un prix de (\\d+) et (\\d+)")
	public void ils_ont_un_prix(double prix1, double prix2) {
		this.bateau1.setPrix(prix1);
		this.bateau2.setPrix(prix2);
	}
	@When("Le concessionnaire achete les bateaux")
	public void le_concessionnaire_achete_les_bateaux() {
		this.Boatrental = new ConcessionnaireBateau();
		this.Boatrental.ajoutBateau(bateau1);
		this.Boatrental.ajoutBateau(bateau2);
	}
	@Then("Les bateaux sont achetés")
	public void les_bateaux_sont_achetés() {
		ArrayList<Bateau> bateauTest = new ArrayList<Bateau>();
		bateauTest.add(bateau1);
		bateauTest.add(bateau2);
		assertEquals(Boatrental.getBateaux(), bateauTest);
	}

}
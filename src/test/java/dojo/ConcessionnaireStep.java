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
	private Marin romeo;
	
	@Given("Deux bateaux (.*) et (.*)")
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
	@Given("Le concessionnaire a deux bateaux (.*) et (.*)")
	public void concessionnaire_a_deux_bateau(String nom1, String nom2) {
		this.bateau1 = new Bateau();
		this.bateau2 = new Bateau();
		this.bateau1.setNom(nom1);
		this.bateau2.setNom(nom2);
	}
	@And("Ils ont respectivement un prix de (\\d+) et (\\d+)")
	public void ils_ont_respectivement_un_prix(double prix1, double prix2) {
		this.bateau1.setPrix(prix1);
		this.bateau2.setPrix(prix2);
		this.Boatrental = new ConcessionnaireBateau();
		this.Boatrental.ajoutBateau(bateau1);
		this.Boatrental.ajoutBateau(bateau2);
		this.bateau1.setConcessionnaireBateau(Boatrental);
		this.bateau2.setConcessionnaireBateau(Boatrental);
	}
	@When("Un marin de (\\d+) ans avec (\\d+)€ achete")
	public void un_marin_veut_acheter(int age, double portefeuille) {
		this.romeo = new Marin(age);
		this.romeo.setPortefeuille(portefeuille);
	}
	@Then("Un bateau est acheté")
	public void un_bateau_est_acheté() {
		this.romeo.transactionBateau(this.bateau1);
		
		ArrayList<Bateau> bateauTest = new ArrayList<Bateau>();
		bateauTest.add(bateau2);
		assertEquals(Boatrental.getBateaux(), bateauTest);
		assertEquals(romeo.isProprietaireBateau(), true);
	}

}
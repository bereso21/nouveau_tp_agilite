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

public class MarinStep {
	private Marin romeo;
	private Bateau bateau;
	private ConcessionnaireBateau Boatrental;
	private Bateau bateau1;
	private Bateau bateau2;
    @Given("Romeo a (\\d+) ans et (\\d+)€. Il veut acheter un bateau")
    public void romeo_veut_acheter_un_bateau(int age, double portefeuille) {
        // Write code here that turns the phrase above into concrete actions
    	this.romeo = new Marin();
        this.romeo.setAge(age);
        this.romeo.setPortefeuille(portefeuille);
    }
    @When("Il y a un bateau nommé (.*) vendu au prix de (\\d+)€")
    public void il_y_a_un_bateau_a_vendre(String nom, double prix) {
        // Write code here that turns the phrase above into concrete actions
        this.bateau = new Bateau(nom, prix);
    }
    @Then("Romeo achete le bateau")
    public void romeo_achete_le_bateau() {
        // Write code here that turns the phrase above into concrete actions
        double bourse = this.romeo.getPortefeuille() - this.bateau.getPrix();
    	this.romeo.setPortefeuille(bourse);
    	this.romeo.setProprietaireBateau(true);
    }
    @Given("Romeo a (\\d+) ans et (\\d+)€. Il veut acheter un nouveau bateau")
    public void romeo_veut_acheter_un_nouveau_bateau(int age, double portefeuille) {
        // Write code here that turns the phrase above into concrete actions
    	this.romeo = new Marin();
        this.romeo.setAge(age);
        this.romeo.setPortefeuille(portefeuille);
    }
    @And("Il y a un nouveau bateau nommé (.*) vendu au prix de (\\d+)€")
    public void il_y_a_un_nouveau_bateau_a_vendre(String nom, double prix) {
        // Write code here that turns the phrase above into concrete actions
        this.bateau = new Bateau(nom, prix);
    }
    @When("Romeo veut acheter le bateau mais n a pas assez")
    public void romeo_n_a_pas_assez() {
    	// Write code here that turns the phrase above into concrete actions
    }
    @Then("L achat est refusé")
    public void l_achat_est_refusé() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(romeo.achatBateau(this.bateau), "Vous n'avez pas assez d'argent");
    }
    
    /*
    @Given("Deux bateau (.*) et (.*)")
	public void il_y_a_deux_bateau(String nom1, String nom2) {
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
		this.Boatrental.ajoutBateau(bateau1);
		this.Boatrental.ajoutBateau(bateau2);
	}
	@Then("Les bateaux sont achetés")
	public void les_bateaux_sont_achetés() {
		ArrayList<Bateau> bateauTest = new ArrayList<Bateau>();
		bateauTest.add(bateau1);
		bateauTest.add(bateau2);
		assertEquals(Boatrental, bateauTest);
	}*/
}
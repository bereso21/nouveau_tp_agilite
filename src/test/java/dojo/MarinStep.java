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

public class MarinStep {
	private Marin romeo;
	private Bateau bateau;
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
    
}
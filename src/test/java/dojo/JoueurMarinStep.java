package dojo;  

import static org.junit.Assert.assertEquals;


import org.junit.Assert;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;
import factory.GetPersonneFactory;
import cucumber.api.java.en.And;
import main.Bateau;
import main.Marin;
import factory.Personne;

public class JoueurMarinStep {
	private Bateau bateau;
	private GetPersonneFactory gpf;
	private Personne person;
    @Given("On a une personne")
    public void on_a_une_personne() {
        // Write code here that turns the phrase above into concrete actions
    	this.gpf = new GetPersonneFactory();
    }
    @When("Elle a achete un bateau (.*)")
    public void la_personne_achete_un_bateau(String nomBateau) {
        // Write code here that turns the phrase above into concrete actions
    	this.bateau = new Bateau();
    	this.bateau.setNom(nomBateau);
    	this.person = gpf.getPersonne("Marin");
    	((Marin) this.person).setProprietaireBateau(true);
    }
    @Then("Elle devient un marin propiétaire")
    public void elle_devient_un_marin_proprietaire() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(((Marin) this.person).isProprietaireBateau(), true);
    }
    
}
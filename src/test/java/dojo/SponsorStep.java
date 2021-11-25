package dojo;  

import static org.junit.Assert.assertEquals;


import org.junit.Assert;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import main.ConcessionnaireBateau;
import foot.Club;
import sponsor.Sponsor;

public class SponsorStep {
	private ConcessionnaireBateau concBat;
	private Club club;
	private Sponsor sponsor;
    @Given("On a un concessionnaire (.*)")
    public void on_a_un_concessionnaire(String nomCons) {
        // Write code here that turns the phrase above into concrete actions
    	this.concBat = new ConcessionnaireBateau(nomCons);
    }
    @And("Un club (.*)")
    public void on_a_un_club(String nomClub) {
        // Write code here that turns the phrase above into concrete actions
    	this.club = new Club();
    	this.club.setNomClub(nomClub);
    }
    @When("Le concessionnaire le souhait")
    public void le_concessionnaire_le_souhaite() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("Il sponsorise le club et le club devient sponsorise")
    public void romeo_achete_le_bateau() {
        // Write code here that turns the phrase above into concrete actions
        this.sponsor = new Sponsor(this.concBat.getNom());
        this.sponsor.setClub(club);
        this.club.setSponsor(sponsor);
    }
    
}
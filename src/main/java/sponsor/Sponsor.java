package sponsor;

import main.ConcessionnaireBateau;
import foot.Club;

public class Sponsor extends ConcessionnaireBateau{
	
	private Club club;
	private String nomSponsor;
	private String nomClub;
	
	public Sponsor() {
		this.nomSponsor = "";
	}
	
	public Sponsor(String nomSponsor) {
		this.nomSponsor = nomSponsor;
	}
	
	public void setSponsor(String nomSponsor) {
		this.nomSponsor = nomSponsor;
	}
	
	public Club getClub() {
		if(this.club!=null) {
    		return this.club;
    	} else {
    		System.out.println("Ce concessionaire ne sponsorise pas de club");
    		return null;
    	}
	}
	
	public String getNomSponsor() {
		return this.nomSponsor;
	}
	
	public String getNomClub() {
		if(this.nomClub!=null) {
    		return this.nomClub;
    	} else {
    		System.out.println("Ce concessionaire ne sponsorise pas de club");
    		return "Ce concessionaire ne sponsorise pas de club";
    	}
	}
	
	public void setClub(Club club) {
		this.club = club;
		this.nomClub = club.getNomClub();
	}
}
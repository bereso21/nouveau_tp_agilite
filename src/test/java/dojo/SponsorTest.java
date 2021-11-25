package dojo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import sponsor.Sponsor;
import foot.Club;

public class SponsorTest {
	
	Club club;
	Sponsor consBat;
    
    public SponsorTest() {
    }

    @Before
    public void setUp() throws Exception {
    	this.club = new Club();
    	this.consBat = new Sponsor();
    }

    @org.junit.Test
    public void testSetClub() {
    	consBat.setClub(club);
    	assertEquals(club, consBat.getClub());
    }

    @org.junit.Test
    public void testGetNomClub() {
        assertEquals(this.consBat.getNomClub(), "Ce concessionaire ne sponsorise pas de club");
    }
}

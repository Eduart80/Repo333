package Tests;

import DriverWrapper.Web;
import Pages.Hotels.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTests extends Web {


    // Testcase 1: User is able to click Select button
    /*
        Landing
            search
     */
    @Test
    public void verifySeachIsClickable() {
        LandingPage lpage = new LandingPage();
        Assert.assertTrue(lpage.isSearchButtonEnabled(), "Search button is not enabled");
    }

    // Testcase 2: Verify correct number of night displayed on briefcase
    /*
        Landing
            Checkin
            Checkout
            Briefcase
     */
    @Test
    public void verifyBriefcaseCount() {
        LandingPage lpage = new LandingPage();
        String checkIn = "10";
        String checkOut = "15";
        String expNights = "5";
        lpage.selectCheckInDate(checkIn);
        lpage.selectCheckOutDate(checkOut);
        Assert.assertEquals(lpage.getBriefcaseText(), expNights, "");
    }




}

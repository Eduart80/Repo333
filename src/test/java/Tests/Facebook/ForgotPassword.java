package Tests.Facebook;

import DriverWrapper.Web;
import Pages.Facebook.ForgotPasswordPage;
import Pages.Facebook.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPassword extends Web {

    LandingPage lpage = new LandingPage();
    ForgotPasswordPage fppage = new ForgotPasswordPage();

    @Test
    public void emptyForgotPasswordError() {
        /*
        Scenario: Verify user is gets error when submit empty request on Forgot Password

        Steps:
        1. Launch Facebook
        2. Click on 'Forgot Password' link
        3. Click on 'Search' button
        4. Verify the error
         */

        lpage.clickForgotPassword();
        fppage.clickSearch();
        Assert.assertTrue(fppage.isEmptySearchErrorDisplayed(), "Empty Search is not displayed");

    }


}

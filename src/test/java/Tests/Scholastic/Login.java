package Tests.Scholastic;

import DriverWrapper.Web;
import Pages.Scholastic.HomePage;
import Pages.Scholastic.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Web {

    HomePage hpage = new HomePage();
    SignInPage spage = new SignInPage();

    @Test
    public void verifyInvalidCredentials() {

        /*
            Click Sign in from Homepage
            Enter email in Sign in page
            Enter password in Sign in Page
            Click Sign In button in Sign in page
            Verify error on Sign in page
         */
        hpage.clickSignInFromHeader();
        spage.enterSignInEmail("testing@gmail.com");
        spage.enterSignInPassword("testing01!");
        spage.clickSignInButton();
        Assert.assertTrue(spage.isSignInErrorDisplayed(), "");


    }




}

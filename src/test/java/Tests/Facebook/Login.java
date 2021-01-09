package Tests.Facebook;

import Pages.Facebook.LandingPage;
import Pages.Facebook.WrongPassword;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
    LandingPage lPage = new LandingPage();
    WrongPassword wPage = new WrongPassword();

    @Test
    public void verifyInvalidCredentialsFlow() {
        /*
            type login email
            type incorrect password
            click login button
            verify error
         */
        lPage.enterLoginEmail("test@gmail.com");
        lPage.enterPasswordEmail("testing");
        lPage.clickLoginButton();
        Assert.assertTrue(wPage.isIncorrectPasswordErrorDisplayed(), "Error message not displayed");
    }



}

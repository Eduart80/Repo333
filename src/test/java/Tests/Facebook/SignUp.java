package Tests.Facebook;

import DriverWrapper.Web;
import Pages.Facebook.LandingPage;
import Pages.Facebook.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUp extends Web {

    LandingPage lpage = new LandingPage();
    SignUpPage supage = new SignUpPage();

    @Test
    public void mobileError() {
        lpage.clickCreateNewAccount();
        supage.enterFirstname("First");
        supage.enterLastname("last");
        supage.enterMobileOrEmail("1234567890");
        supage.enterNewPassword("Passw0rd!");
        supage.selectDate("10");
        supage.selectMonth("Jan");
        supage.selectYear("1990");
        supage.clickMaleGender();
        supage.clickSignUpButton();
        Assert.assertTrue(supage.isPhoneErrorDisplayed(), "Phone error is not displayed");
    }

}

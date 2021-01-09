package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class SignInPage extends BasePage {

    By signInEmail = By.xpath("//input[contains(@id,'dwfrm_login_username_d')]");
    By signInPassword = By.xpath("//input[contains(@id,'dwfrm_login_password_d')]");
    By signInButton = By.id("loginModalBtn");
    By signInError = By.xpath("//div[@id='errorAccountLocked1']//div[contains(text(),'Please try again.') and @class='content-asset ']");


    public void enterSignInEmail(String email) {
        // driver.findElement(signInEmail).sendKeys(email)
        type(signInEmail, email);
    }

    public void enterSignInPassword(String pass) {
        // driver.findElement(signInPassword).sendKeys(pass)
        type(signInPassword, pass);
    }

    public void clickSignInButton() {
        clickThis(signInButton);
    }

    public boolean isSignInErrorDisplayed() {
        return isElementDisplayed(signInError);
    }









}

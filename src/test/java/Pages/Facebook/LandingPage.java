package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    // Locators
    By loginEmail = By.id("email");
    By loginPassword = By.id("pass");
    By loginButton = By.tagName("button");
    By forgotPassword = By.linkText("Forgotten password?");
    By createNewAccount = By.linkText("Create New Account");

    // Methods
    public void enterLoginEmail(String email) {
        type(loginEmail, email);
    }

    public void enterPasswordEmail(String password) {
        type(loginPassword, password);
    }

    public void clickLoginButton() {
        clickThis(loginButton);
    }

    public void clickForgotPassword() {
        clickThis(forgotPassword);
    }

    public void clickCreateNewAccount() {
        clickThis(createNewAccount);
    }








}

package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignUpPage extends BasePage {

    By firstname = By.name("firstname");
    By lastname = By.name("lastname");
    By mobileEmail = By.name("reg_email__");
    By newPassword = By.id("password_step_input");
    By date = By.id("day");
    By month = By.id("month");
    By year = By.id("year");
    By maleRadio = By.xpath("//label[text()='Male']/following-sibling::input");
    By femaleRadio = By.xpath("//label[text()='Female']/following-sibling::input");
    By signUpButton = By.xpath("//button[@name='websubmit']");
    By phoneNumberError = By.xpath("//div[contains(text(),'Please enter a valid mobile')]");


    public void enterFirstname(String fname) {
        type(firstname, fname);
    }

    public void enterLastname(String lname) {
        type(lastname, lname);
    }

    public void enterMobileOrEmail(String mobEmail) {
        type(mobileEmail, mobEmail);
    }

    public void enterNewPassword(String pwd) {
        type(newPassword, pwd);
    }

    public void selectDate(String day) {
        selectFromDropdownUsingVisibleText(date, day);
    }

    public void selectMonth(String monthName) {
        selectFromDropdownUsingVisibleText(month, monthName);
    }

    public void selectYear(String yearValue) {
        selectFromDropdownUsingVisibleText(year, yearValue);
    }

    public void clickMaleGender() {
        clickThis(maleRadio);
    }

    public void clickFemaleGender() {
        clickThis(femaleRadio);
    }

    public void selectGender(String gender) {
        switch (gender.toLowerCase()) {
            case "male":
                clickThis(maleRadio);
                break;
            case "female":
                clickThis(femaleRadio);
                break;
            default:
                new Exception("Invalid gender - " + gender);
        }
    }

    public void clickSignUpButton() {
        clickThis(signUpButton);
    }

    public boolean isPhoneErrorDisplayed() {
        clickThis(mobileEmail);
        return isElementDisplayed(phoneNumberError);
    }


}

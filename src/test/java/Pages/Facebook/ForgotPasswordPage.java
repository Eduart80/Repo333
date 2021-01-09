package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends BasePage {


    By search = By.xpath("//input[@value='Search']");
    By emptySearchError = By.xpath("//div[text()='Please fill in at least one field']");


    public void clickSearch() {
        clickThis(search);
    }

    public boolean isEmptySearchErrorDisplayed() {
        return isElementDisplayed(emptySearchError);
    }




}

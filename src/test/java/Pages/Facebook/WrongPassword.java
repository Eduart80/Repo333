package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class WrongPassword extends BasePage {

    By incorrectPasswordError = By.xpath("//div[text()='You can\'t use this feature at the moment']");


    public boolean isIncorrectPasswordErrorDisplayed() {
        return isElementDisplayed(incorrectPasswordError);
    }


}

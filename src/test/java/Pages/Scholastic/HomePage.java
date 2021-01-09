package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    By signInHeader = By.xpath("//a[contains(text(),'Sign In') and contains(@class,'signin pureguest')]");


    public void clickSignInFromHeader() {
        // driver.findElement().click();
        clickThis(signInHeader);
    }








}

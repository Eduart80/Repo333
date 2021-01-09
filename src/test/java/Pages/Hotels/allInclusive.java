package Pages.Hotels;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class allInclusive extends BasePage {

    //By AllInclusivePage=By.id("hdr-packages");
    By otherPageAllInclusive=By.xpath("//a[text()='Packages & Flights']");
    By from=By.xpath("//input[@class='clear-btn-input gcw-storeable text gcw-origin gcw-required gcw-distinct-locations']");
    By to = By.xpath("//input[@id='package-destination-hp-package");

    public void goToLink(){
        WebElement a = Web.getDriver().findElement(otherPageAllInclusive);
        boolean aa = a.isDisplayed();
        if (aa){
            clickThis(otherPageAllInclusive);
        }
       // clickThis(AllInclusivePage);
    }
    public void fromLocation(String name){
      //clickThis(from);
        waitAMin();
        enterField(from,name);
    }
    public void toLocation(String name){
        //clickThis(to);
        enterField(to,name);
    }

}

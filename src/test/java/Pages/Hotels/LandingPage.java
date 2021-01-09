package Pages.Hotels;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage  extends BasePage {

    // Locators
    By searchButton = By.xpath("//button[@type='submit']");
    By checkInCalendar = By.id("qf-0q-localised-check-in");
    By checkOutCalendar = By.id("qf-0q-localised-check-out");
    By allCalenderDates = By.xpath("//td[starts-with(@data-date,'2020-11')]");
    By briefcase = By.xpath("//span[@class='widget-query-num-nights']");
    By dealsLink =By.id("hdr-deals");



    // Method to interact with webElement (represent by above Locators)
    public void clickDeals() {
        clickThis(dealsLink);
    }

    public boolean isSearchButtonEnabled() {
        return Web.getDriver().findElement(searchButton).isEnabled();
    }

    public void selectCheckInDate(String checkInDate) {
        clickThis(checkInCalendar);
        List<WebElement> dates = Web.getDriver().findElements(allCalenderDates);
        for (WebElement date : dates) {
            if (date.getText().equalsIgnoreCase(checkInDate)) {
                date.click();
                break;
            }
        }
    }

    public void selectCheckOutDate(String checkOutDate) {
        clickThis(checkOutCalendar);
        List<WebElement> dates = Web.getDriver().findElements(allCalenderDates);
        for (WebElement date : dates) {
            if (date.getText().equalsIgnoreCase(checkOutDate)) {
                date.click();
                break;
            }
        }
    }

    public String getBriefcaseText() {
        return Web.getDriver().findElement(briefcase).getText();
    }



}

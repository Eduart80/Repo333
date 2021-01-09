package Pages.Hotels;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DealsLandingPage extends BasePage {

    By searchLocation =By.id("qf-1q-destination");
    By autoSuggList=By.xpath("//tbody[@class='autosuggest-city']//div[@class='autosuggest-category-result']");
    By tableCalendar= By.xpath("//div[@class='widget-daterange-cont']");
    By grabDate =By.xpath("//div[@class='widget-datepicker-bd']//tbody//td//a");
    By checkOut =By.id("overlay-q-localised-check-out");
    By checkIn =By.id("overlay-q-localised-check-in");
    By buttContinue=By.xpath("//button[@class='cta widget-overlay-ok']");
    By selectQuality=By.xpath("//div[@class='details resp-module']//div[@class='reviews-box resp-module']");
    By clickEnterDate=By.xpath("//aside[@class='pricing resp-module']//a");

    public void findLocation(String name){
        enterField(searchLocation,name);
    }
    public void autoSelectDate(String number){
        clickThis(checkIn);
        List<WebElement> myList = Web.getDriver().findElements(grabDate);
        waitASec();
        for(WebElement divIn : myList){
            if (divIn.getText().contains(number)){
                System.out.println("list in: -> "+divIn.getText());
                divIn.click();
                break;
            }
        }
    }
    public void autoSelectDate2(String number){
        clickThis(checkOut);
        List<WebElement> myList = Web.getDriver().findElements(grabDate);
        waitASec();
        for(WebElement divIn : myList){
            if (divIn.getText().contains(number)){
                System.out.println("list: -> "+divIn.getText());
                divIn.click();
                break;
            }
        }
    }
    public void checkListActive(String name){
        List<WebElement> myList = Web.getDriver().findElements(autoSuggList);
        waitASec();
        for(WebElement divIn : myList){
            if (divIn.getText().contains(name)){
                System.out.println("list: -> "+divIn.getText());
                submitIt(searchLocation,name);
                break;
            }
        }
    }
    public void selectQuality(String name){
        List<WebElement> myList = Web.getDriver().findElements(selectQuality);
        waitASec();
        for(WebElement divIn : myList){
            if (divIn.getText().contains(name)){
                System.out.println("Quality: -> "+divIn.getText());
                clickThis(clickEnterDate);
                break;
            }
        }
    }
    public void contButton(){
        clickThis(buttContinue);
    }


}

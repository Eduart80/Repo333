package StepDefinition;

import Pages.Hotels.DealsLandingPage;
import Pages.Hotels.LandingPage;
import Pages.Hotels.allInclusive;
import cucumber.api.java.en.When;

public class SDfile {
    LandingPage pp = new LandingPage();
    DealsLandingPage lp = new DealsLandingPage();
    allInclusive op = new allInclusive();

    @When("^the address i click 'Deals' linkText$")
    public void clickDeals(){
        pp.clickDeals();
    }
    @When("^search for '(.+)' location$")
    public void locat(String name){
        lp.findLocation(name);
    }
    @When("^get city '(.+)' from list$")
    public void getList(String name){
        lp.checkListActive(name);
    }
    @When("^in calendar select Date '(.+)' to checkIn$")
    public void dateIN(String number){
        lp.autoSelectDate(number);
    }
    @When("^select Date '(.+)' to checkOut$")
    public void dateOUT(String number){
        lp.autoSelectDate2(number);
    }
    @When("^select quality '(.+)' hotel$")
    public void selQual(String name){
        lp.selectQuality(name);
    }
    @When("^click Continue button$")
    public void Continue(){
        lp.contButton();
    }
    @When("^i click on all inclusive text link$")
    public void AllPackage(){
        pp.url();
        op.goToLink();
    }
    @When("^select travel from '(.+)'$")
    public void fromPackage(String name){
        op.fromLocation(name);
    }
    @When("^and select destination '(.+)'$")
    public void toPackage(String name){
        op.toLocation(name);
    }



}

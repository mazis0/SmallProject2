package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.SearchPage;

public class SearchStep {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

    @Given("User enter hotel location as {string}")
    public void user_enter_hotel_location_as(String location)throws InterruptedException {
        homePage.enterLocation(location);
    }
    @Given("User select check in date as {string}")
    public void user_select_checkindate_as(String date)throws Exception {
        homePage.selectCheckInDate(date);
    }
    @Given("User select check out date as {string}")
    public void user_select_checkoutdate_as(String date)throws Exception {
        homePage.selectCheckOutDate(date);
    }

    @And("User select hotel")
    public void user_select_hotel()throws InterruptedException{
        homePage.selectHotel();
    }

    @Given("User click on search now button")
    public void clickOnSearchNowButton()throws InterruptedException{
        homePage.clickOnSearchNowButton();
    }

    @Then("Available hotel should be displayed")
    public void availableHotelShouldBeDisplayed(){
        Assert.assertTrue(searchPage.verifySearchPage());
    }

    @Then("Verify checkin and checkout date are {string} and {string}")
    public void verify_checkout_and_checkin_same_as_and(String checkindate, String checkoutdate) {
        Assert.assertEquals(checkindate,searchPage.getTextCheckInTime());
        Assert.assertEquals(checkoutdate,searchPage.getTextCheckOutTime());
    }

    @When("User click dropdown price and user choose lowest")
    public void user_click_dropdown_price_and_user_choose_lowest() {
        searchPage.clickOnLowestPrice();
    }

    @Then("Verify sorting price lowest is working properly")
    public void verify_dropdown_price_lowest_is_working_properly()throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(searchPage.verifyDropDownPriceLowest());
    }

    @When("User click dropdown price and user choose highest")
    public void user_click_dropdown_price_and_user_choose_highest() {
        searchPage.clickOnHighestPrice();
    }

    @Then("Verify sorting price highest is working properly")
    public void verify_dropdown_price_highest_is_working_properly()throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(searchPage.verifyDropDownPriceHighest());
    }





}

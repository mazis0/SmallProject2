package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class LandingPageStep {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("User click on menu in the top right corner")
    public void user_click_on_menu_in_the_top_right_corner() {
        homePage.clickOnMenu();
    }
    @When("User click on Interior")
    public void user_click_on_interior() {
        homePage.clickOnButtonInterior();
    }
    @Then("Interior details information should be displayed")
    public void interior_details_information_should_be_displayed() {
        Assert.assertTrue(homePage.verifyMenuInterior());
    }

    @When("User click on Rooms")
    public void user_click_on_rooms() {
        homePage.clickOnButtonRooms();
    }
    @Then("Rooms details information should be displayed")
    public void rooms_details_information_should_be_displayed() {
        Assert.assertTrue(homePage.verifyMenuOurRoom());
    }
    @When("User click on Testimonials")
    public void user_click_on_testimonials() {
        homePage.clickOnButtonTestimonial();
    }

    @Then("Testimonials details information should be displayed")
    public void testimonials_details_information_should_be_displayed() {
        Assert.assertTrue(homePage.verifyTestimonials());
    }

    @When("User click on Legal")
    public void user_click_on_legal() {
        homePage.clickOnButtonLegalNotice();
    }

    @Then("Legal details information should be displayed")
    public void legal_details_information_should_be_displayed() {
        Assert.assertTrue(homePage.verifyLegal());
    }
}

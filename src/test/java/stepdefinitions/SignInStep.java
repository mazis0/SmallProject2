package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CreateAnAccountPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.SigninPage;

public class SignInStep {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    SigninPage signinPage = new SigninPage(DriverFactory.getDriver());
    MyAccountPage myAccountPage = new MyAccountPage(DriverFactory.getDriver());
    CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(DriverFactory.getDriver());


    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        homePage.isUserOnHomePage();
    }
    @Given("User click on Sign in")
    public void user_click_on_sign_in() {
        homePage.clickOnButtonSignIn();
    }
    @Given("User is on Sign in Page")
    public void user_is_on_sign_in_page() {
        signinPage.isUserOnSignInPage();
    }
    @When("User already registered, input email as {string} and password as {string}")
    public void user_already_registered_input_email_as_and_password_as(String email, String password) {
        signinPage.enterEmailOnAlreadyRegisteredFrame(email);
        signinPage.enterPasswordOnAlreadyRegisteredFrame(password);
    }
    @When("click on Sign in button")
    public void click_on_sign_in_button() {
        signinPage.clickOnSignInButton();
    }
    @Then("My Account Page should be displayed")
    public void my_account_page_should_be_displayed() {
        myAccountPage.isUserOnMyAccountPage();
    }
    @Then("Error message {string} should be displayed")
    public void error_message(String errorMessage) {
        Assert.assertEquals(errorMessage,signinPage.getErrorMessage());

    }
    @Given("User create an account,input email as {string}")
    public void user_create_an_account_input_email_as(String email) {
        signinPage.enterEmailonCreateAnEmailFrame(email);
    }

    @Given("User click on create account button")
    public void clickOnCreateAccountButton(){
        signinPage.clickOnCreateAnAccountButton();
    }
    @Given("User is On Create an account page")
    public void user_is_on_create_an_account_page() {
        createAnAccountPage.isUserOnCreateAccountPage();
    }
    @Given("User select title as Mr.")
    public void user_select_title_as() {
        createAnAccountPage.selectTitleMr();
    }
    @Given("User enter firstname as {string}")
    public void user_enter_firstname_as(String firstname) {
        createAnAccountPage.enterFirstName(firstname);
    }
    @Given("User enter lastname as {string}")
    public void user_enter_lastname_as(String lastname) {
        createAnAccountPage.enterLastName(lastname);
    }
    @Given("User enter email as {string}")
    public void user_enter_email_as(String email) {
        createAnAccountPage.enterEmail(email);
    }
    @Given("User enter password as {string}")
    public void user_enter_password_as(String password) {
        createAnAccountPage.enterPassword(password);
    }

    @Given("User select date of birth as {string} , {string}, {string}")
    public void user_select_date_of_birth_as(String days, String months, String years) {
        createAnAccountPage.selectDateOfBirth(days, months, years);
    }
    @Given("User click on register button")
    public void user_click_on_register_button() {
        createAnAccountPage.clickOnRegisterButton();
    }
    @Then("Message {string} should be displayed")
    public void message_should_be_displayed(String message) {
        Assert.assertEquals(message,createAnAccountPage.getMessageYourAccountHasBeenCreated());
    }
    @Then("Error Message {string} should be displayed")
    public void error_message_should_be_displayed(String error) {
        Assert.assertEquals(error,createAnAccountPage.getErrorMessage());
    }
}

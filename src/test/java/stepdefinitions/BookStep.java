package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;

public class BookStep {
    SearchPage searchPage = new SearchPage(DriverFactory.getDriver());
    CartPage cartPage = new CartPage(DriverFactory.getDriver());
    GuessInformationPage guessInformationPage = new GuessInformationPage(DriverFactory.getDriver());
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(DriverFactory.getDriver());
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage(DriverFactory.getDriver());

    @Given("User booking the hotel room as {string}")
    public void user_choose_hotel_room_as(String roomName)throws InterruptedException {
        if(roomName.equals("deluxe")){
            searchPage.clickOnBookNowDeluxeRooms();
        }else if(roomName.equals("executive")){
            searchPage.clickOnBookNowExecutiveRooms();
        }else if(roomName.equals("luxury")){
            searchPage.clickOnBookNowLuxuryRooms();
        }else if(roomName.equals("general")){
            searchPage.clickOnBookNowGeneralRooms();
        }else{
            System.out.println("please enter correct room");
        }

    }
    @Given("User click on proceed to checkout")
    public void user_click_on_proceed_to_checkout() {
        searchPage.clickOnProceedToCheckout();
    }
    @Given("User click on proceed")
    public void user_click_on_proceed() throws InterruptedException{
        guessInformationPage.clickOnButtonProceed();
    }
    @Given("User select gender as {string}")
    public void user_select_gender_as(String gender) {
        guessInformationPage.selectGender(gender);
    }
    @Given("User input firstname as {string}")
    public void user_input_firstname_as(String firstname) {
        guessInformationPage.inputFirstname(firstname);
    }
    @Given("User lastname as {string}")
    public void user_lastname_as(String lastname) {
        guessInformationPage.inputLastname(lastname);
    }
    @Given("User input email as {string}")
    public void user_input_email_as(String email) {
        guessInformationPage.inputEmail(email);
    }
    @Given("User input password as {string}")
    public void user_input_password_as(String password) {
        guessInformationPage.inputPassword(password);
    }
    @Given("User input mobile phone as {string}")
    public void user_input_mobile_phone_as(String mobilePhone) {
        guessInformationPage.inputMobilePhone(mobilePhone);
    }
    @Given("User click on save button")
    public void user_click_on_save_button() {
        guessInformationPage.clickOnSaveButton();
    }
    @Given("click on proceed")
    public void click_on_proceed()throws InterruptedException {
        cartPage.clickOnProceed();
    }
    @Given("User select checkbox term agreement")
    public void user_select_checkbox_term_agreement() {
        paymentInformationPage.clickOnCheckboxAgreement();
    }
    @Given("User select payment as {string}")
    public void user_select_payment_as(String payment) {
        if(payment.equals("bank wire")){
            paymentInformationPage.selectPayByBankWire();
        }else if(payment.equals("check")){
            paymentInformationPage.selectPayByCheck();
        }else if(payment.equals("card or paypal")){
            paymentInformationPage.selectPayWithYourCardOrPaypal();
        }
    }
    @When("User click on i confirm my order button")
    public void user_click_on_i_confirm_my_order_button() {
        paymentInformationPage.clickOnIConfirmMyOrder();
    }
    @Then("Succussfull order Message as {string} should be displayed")
    public void succussfull_order_message_as_should_be_displayed(String message) {
        Assert.assertEquals(message,orderConfirmationPage.getCompleteOrderMessage());
    }

    @Then("Error Message as {string} should be displayed")
    public void error_message_as_should_be_displayed(String errorMessage) {
        Assert.assertEquals(errorMessage,guessInformationPage.getErrorMessage());
    }
}

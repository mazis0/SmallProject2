package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.XMLFormatter;

public class CreateAnAccountPage {
    WebDriver driver;

    @FindBy(xpath = "//h1[.=\"Create an account\"]")
    private WebElement labelCreateAnAccount;

    @FindBy(xpath = "//h3[.=\"Your personal information\"]")
    private WebElement labelYourPersonalInformation;

    @FindBy(xpath = "//label[.=\"Title\"]")
    private WebElement labelTitle;

    @FindBy(xpath = "//input[@id=\"id_gender1\"]")
    private WebElement checkboxGenderMr;

    @FindBy(xpath = "//input[@id=\"id_gender2\"]")
    private WebElement checkboxGenderMrs;

    @FindBy(xpath = "//input[@id=\"customer_firstname\"]")
    private WebElement textFirstName;

    @FindBy(xpath = "//input[@id=\"customer_lastname\"]")
    private WebElement textLastName;

    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement textEmail;

    @FindBy(xpath = "//input[@id=\"passwd\"]")
    private WebElement textPassword;

    @FindBy(xpath = "//select[@id=\"days\"]")
    private WebElement selectDays;

    @FindBy(xpath = "//select[@id=\"months\"]")
    private WebElement selectMonths;

    @FindBy(xpath = "//select[@id=\"years\"]")
    private WebElement selectYears;

    @FindBy(xpath = "//button[@id=\"submitAccount\"]")
    private WebElement buttonRegister;

    @FindBy(xpath = "//label[@for=\"customer_firstname\"]")
    private WebElement labelFirstName;

    @FindBy(xpath = "//label[@for=\"customer_lastname\"]")
    private WebElement labelLastName;

    @FindBy(xpath = "//label[@for=\"email\"]")
    private WebElement labelEmail;

    @FindBy(xpath = "//label[@for=\"passwd\"]")
    private WebElement labelPassword;

    @FindBy(xpath = "//label[.=\"Date of Birth\"]")
    private WebElement labelDateOfBirth;

    @FindBy(xpath = "//input[@id=\"newsletter\"]")
    private WebElement checkboxSignUpForOurNewsLetter;

    @FindBy(xpath = "//input[@id=\"optin\"]")
    private WebElement checkboxReceiveSpecialOffersFromOurPartner;

    @FindBy(xpath = "//label[@for=\"newsletter\"]")
    private WebElement labelSignUpForOurNewsLetter;

    @FindBy(xpath = "//label[@for=\"optin\"]")
    private WebElement labelReceiveSpecialOffersFromOurPartner;

    @FindBy(xpath = "//p[@class=\"pull-right required\"]/child::span")
    private WebElement labelRequiredField;

    @FindBy(xpath = "//p[@class=\"alert alert-success\"]")
    private WebElement messageYourAccountHasBeenCreated;

    @FindBy(xpath = "//div[@class=\"alert alert-danger\"]/child::p")
    private WebElement errorMessage;

    public CreateAnAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;

    }

    public boolean isUserOnCreateAccountPage(){
        labelCreateAnAccount.isDisplayed();
        labelYourPersonalInformation.isDisplayed();
        return true;

    }
    public void enterFirstName(String firstname){
        labelFirstName.isDisplayed();
        textFirstName.isDisplayed();
        textFirstName.isEnabled();
        textFirstName.clear();
        textFirstName.sendKeys(firstname);
    }
    public void enterLastName(String lastname){
        labelLastName.isDisplayed();
        textLastName.isDisplayed();
        textLastName.isEnabled();
        textLastName.clear();
        textLastName.sendKeys(lastname);
    }
    public void enterEmail(String email){
        labelEmail.isDisplayed();
        textEmail.isDisplayed();
        textEmail.isEnabled();
        textEmail.clear();
        textEmail.sendKeys(email);
    }
    public void enterPassword(String password){
        labelPassword.isDisplayed();
        textPassword.isDisplayed();
        textPassword.isEnabled();
        textPassword.clear();
        textPassword.sendKeys(password);
    }
    public void selectDateOfBirth(String days,String months,String years){
        Select selectingdays = new Select(selectDays);
        selectingdays.selectByValue(days);
        Select selectingMonths = new Select(selectMonths);
        selectingMonths.selectByValue(months);
        Select selectingYears = new Select(selectYears);
        selectingYears.selectByValue(years);
    }
    public void clickOnRegisterButton(){
        checkboxReceiveSpecialOffersFromOurPartner.isDisplayed();
        checkboxReceiveSpecialOffersFromOurPartner.isEnabled();
        checkboxSignUpForOurNewsLetter.isDisplayed();
        checkboxSignUpForOurNewsLetter.isEnabled();
        labelReceiveSpecialOffersFromOurPartner.isDisplayed();
        labelSignUpForOurNewsLetter.isDisplayed();
        labelRequiredField.isDisplayed();
        buttonRegister.isDisplayed();
        buttonRegister.isEnabled();
        buttonRegister.click();

    }

    public String getMessageYourAccountHasBeenCreated(){
        return messageYourAccountHasBeenCreated.getText();
    }

    public void selectTitleMr(){
        checkboxGenderMr.isEnabled();
        checkboxGenderMr.click();
    }
    public String getErrorMessage(){
        return errorMessage.getText();
    }

}

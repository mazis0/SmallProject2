package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SigninPage {
    WebDriver driver;

    @FindBy(xpath = "//h1[.=\"Authentication\"]")
    private WebElement labelAuthentication;

    @FindBy(xpath = "//h3[.=\"Create an account\"]")
    private WebElement labelCreateAnAccount;

    @FindBy(xpath = "//h3[.=\"Already registered?\"]")
    private WebElement labelAlreadyRegistered;

    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement textEmailOnAlreadyRegisteredFrame;

    @FindBy(xpath = "//input[@id=\"passwd\"]")
    private WebElement textPassword;

    @FindBy(xpath = "//a[.=\"Forgot your password?\"]")
    private WebElement labelForgotYourPassword;

    @FindBy(xpath = "//button[@id=\"SubmitLogin\"]")
    private WebElement buttonSigIn;

    @FindBy(xpath = "//input[@id=\"email\"]/preceding-sibling::label")
    private WebElement labelEmailAddressOnAlreadyRegisteredFrame;

    @FindBy(xpath = "//input[@id=\"passwd\"]/preceding-sibling::label")
    private WebElement labelPasswordOnAlreadyRegisteredFrame;

    @FindBy(xpath = "//input[@id=\"email_create\"]/preceding-sibling::label")
    private WebElement labelEmailAddressOnCreateAnAccountFrame;

    @FindBy(xpath = "//input[@id=\"email_create\"]")
    private WebElement textEmailOnCreateAnAccountFrame;

    @FindBy(xpath = "//button[@id=\"SubmitCreate\"]")
    private WebElement buttonCreateAnAccount;

    @FindBy(xpath = "//p[.=\"Please enter your email address to create an account.\"]")
    private WebElement labelPleaseEnterYourEmailAddressToCreateAnAccount;

    @FindBy(xpath = "//div[@class=\"alert alert-danger\"]/child::ol/child::li")
    private WebElement labelErrorMessage;

    public SigninPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;
    }
    public boolean isUserOnSignInPage(){
        labelAuthentication.isDisplayed();
        labelCreateAnAccount.isDisplayed();
        labelAlreadyRegistered.isDisplayed();
        return true;
    }

    public void enterEmailonCreateAnEmailFrame(String email){
        labelPleaseEnterYourEmailAddressToCreateAnAccount.isDisplayed();
        labelEmailAddressOnCreateAnAccountFrame.isDisplayed();
        textEmailOnCreateAnAccountFrame.isDisplayed();
        textEmailOnCreateAnAccountFrame.isEnabled();
        textEmailOnCreateAnAccountFrame.clear();
        textEmailOnCreateAnAccountFrame.sendKeys(email);
    }
    public void clickOnCreateAnAccountButton(){
        buttonCreateAnAccount.isDisplayed();
        buttonCreateAnAccount.isEnabled();
        buttonCreateAnAccount.click();
    }
    public void enterEmailOnAlreadyRegisteredFrame(String email){
        labelEmailAddressOnAlreadyRegisteredFrame.isDisplayed();
        textEmailOnAlreadyRegisteredFrame.isDisplayed();
        textEmailOnAlreadyRegisteredFrame.isEnabled();
        textEmailOnAlreadyRegisteredFrame.clear();
        textEmailOnAlreadyRegisteredFrame.sendKeys(email);
    }
    public void enterPasswordOnAlreadyRegisteredFrame(String password){
        labelPasswordOnAlreadyRegisteredFrame.isDisplayed();
        textPassword.isDisplayed();
        textPassword.isEnabled();
        textPassword.clear();
        textPassword.sendKeys(password);
    }
    public void clickOnSignInButton(){
        labelForgotYourPassword.isDisplayed();
        buttonSigIn.isDisplayed();
        buttonSigIn.isEnabled();
        buttonSigIn.click();
    }
    public String getErrorMessage(){
        labelErrorMessage.isDisplayed();
        return labelErrorMessage.getText();
    }
}

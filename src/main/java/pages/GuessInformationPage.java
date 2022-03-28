package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class GuessInformationPage {
    WebDriver driver;

    @FindBy(xpath = "//select[@id=\"id_gender\"]")
    private WebElement selectGender;

    @FindBy(xpath = "//input[@id=\"customer_firstname\"]")
    private WebElement textFirstname;

    @FindBy(xpath = "//input[@id=\"customer_lastname\"]")
    private WebElement textLastname;

    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement textEmail;

    @FindBy(xpath = "//input[@id=\"passwd\"]")
    private WebElement textPassword;

    @FindBy(xpath = "//input[@id=\"phone_mobile\"]")
    private WebElement textMobilePhone;

    @FindBy(xpath = "//button[@id=\"submitAccount\"]")
    private WebElement buttonSave;

    @FindBy(xpath = "//a[@id=\"openLoginFormBlock\"]")
    private WebElement labelLoginNow;

    @FindBy(xpath = "//p[@class=\"required\"]")
    private WebElement labelRequiredField;

    @FindBy(xpath = "//span[.=\"Final Total\"]/following-sibling::span")
    private WebElement valueFinalTotal;

    @FindBy(xpath = "//div[@class=\"card-body\"]/div[1]//div[@class=\"col-sm-9 col-xs-7 info-value\"]")
    private WebElement valueName;

    @FindBy(xpath = "//div[@class=\"card-body\"]/div[2]//div[@class=\"col-sm-9 col-xs-7 info-value\"]")
    private WebElement valueEmail;

    @FindBy(xpath = "//div[@class=\"card-body\"]/div[3]//div[@class=\"col-sm-9 col-xs-7 info-value\"]")
    private WebElement valueMobilePhone;

    @FindBy(xpath = "//a[@class=\"btn btn-default button button-medium pull-right\"]")
    private WebElement buttonProceed;

    @FindBy(xpath = "//div[@id=\"opc_account_errors\"]/b")
    private WebElement errorMessage;


    public GuessInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;
    }

    public void clickOnButtonProceed(){
        buttonProceed.isDisplayed();
        buttonProceed.isEnabled();
        buttonProceed.click();
    }

    public void selectGender(String gender){
        Select select = new Select(selectGender);
        select.selectByVisibleText(gender);

    }

    public void inputFirstname(String firstname){
        textFirstname.isDisplayed();
        textFirstname.isEnabled();
        textFirstname.sendKeys(firstname);
    }

    public void inputLastname(String lastname){
        textLastname.isDisplayed();
        textLastname.isEnabled();
        textLastname.sendKeys(lastname);
    }

    public void inputEmail(String email){
        textEmail.isDisplayed();
        textEmail.isEnabled();
        textEmail.sendKeys(email);
    }

    public void inputPassword(String password){
        textPassword.isDisplayed();
        textPassword.isEnabled();
        textPassword.sendKeys(password);
    }

    public void inputMobilePhone(String mobilePhone){
        textMobilePhone.isDisplayed();
        textMobilePhone.isEnabled();
        textMobilePhone.sendKeys(mobilePhone);
    }

    public void clickOnSaveButton(){
        buttonSave.isDisplayed();
        buttonSave.isEnabled();
        buttonSave.click();
    }

    public String getErrorMessage(){
        return errorMessage.getText();
    }


}

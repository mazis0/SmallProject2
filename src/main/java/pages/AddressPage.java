package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AddressPage {
    WebDriver driver;

    @FindBy(xpath = "//input[@id=\"firstname\"]")
    private WebElement textFirstname;

    @FindBy(xpath = "//input[@id=\"lastname\"]")
    private WebElement textLastname;

    @FindBy(xpath = "//input[@id=\"company\"]")
    private WebElement textCompany;

    @FindBy(xpath = "//input[@id=\"address1\"]")
    private WebElement textAddress1;

    @FindBy(xpath = "//input[@id=\"address2\"]")
    private WebElement textAddress2;

    @FindBy(xpath = "//input[@id=\"postcode\"]")
    private WebElement textPostcode;

    @FindBy(xpath = "//input[@id=\"city\"]")
    private WebElement textCity;

    @FindBy(xpath = "//select[@id=\"id_state\"]")
    private WebElement selectState;

    @FindBy(xpath = "//select[@id=\"id_country\"]")
    private WebElement selectCountry;

    @FindBy(xpath = "//input[@id=\"phone\"]")
    private WebElement textHomePhone;

    @FindBy(xpath = "//input[@id=\"phone_mobile\"]")
    private WebElement textMobilePhone;

    @FindBy(xpath = "//textarea[@id=\"other\"]")
    private WebElement textAdditionalInformation;

    @FindBy(xpath = "//input[@id=\"alias\"]")
    private WebElement textAddressTitle;

    @FindBy(xpath = "//button[@id=\"submitAddress\"]")
    private WebElement buttonSave;

    @FindBy(xpath = "//a[@class=\"btn btn-defaul button button-small\"]")
    private WebElement buttonBackToYourAddress;

    @FindBy(xpath = "//h1")
    private WebElement labelYourAddress;

    @FindBy(xpath = "//p[@class=\"info-title\"]")
    private WebElement labelYourAddressDescriptions;

    @FindBy(xpath = "//label[@for=\"firstname\"]")
    private WebElement labelFirstname;

    @FindBy(xpath = "//label[@for=\"lastname\"]")
    private WebElement labelLastname;

    @FindBy(xpath = "//label[@for=\"address1\"]")
    private WebElement labelAddress;

    @FindBy(xpath = "//label[@for=\"company\"]")
    private WebElement labelCompany;

    @FindBy(xpath = "//label[@for=\"address2\"]")
    private WebElement labelAddressLine2;

    @FindBy(xpath = "//label[@for=\"postcode\"]")
    private WebElement labelZipPostalCode;

    @FindBy(xpath = "//label[@for=\"city\"]")
    private WebElement labelCity;

    @FindBy(xpath = "//label[@for=\"id_state\"]")
    private WebElement labelState;

    @FindBy(xpath = "//label[@for=\"id_country\"]")
    private WebElement labelCountry;

    @FindBy(xpath = "//label[@for=\"phone\"]")
    private WebElement labelHomePhone;

    @FindBy(xpath = "//label[@for=\"phone_mobile\"]")
    private WebElement labelMobilePhone;

    @FindBy(xpath = "//label[@for=\"other\"]")
    private WebElement labelAdditionalInformation;

    @FindBy(xpath = "//p[@class=\"required\"]")
    private WebElement labelRequired;


    public AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;
    }

    public boolean isUserOnAddressPage(){
        labelYourAddress.isDisplayed();
        labelYourAddressDescriptions.isDisplayed();
        labelFirstname.isDisplayed();
        labelLastname.isDisplayed();
        labelCompany.isDisplayed();
        labelAddress.isDisplayed();
        labelAddressLine2.isDisplayed();
        labelZipPostalCode.isDisplayed();
        labelCity.isDisplayed();
        labelState.isDisplayed();
        labelCountry.isDisplayed();
        labelHomePhone.isDisplayed();
        labelMobilePhone.isDisplayed();
        labelAdditionalInformation.isDisplayed();
        return true;

    }
}

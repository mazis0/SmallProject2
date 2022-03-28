package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PaymentInformationPage extends SearchPage{
    WebDriver driver;
    @FindBy(xpath = "//input[@id=\"cgv\"]")
    private WebElement checkboxAgreement;

    @FindBy(xpath = "//a[@title=\"Pay by bank wire\"]")
    private WebElement optionBankWire;

    @FindBy(xpath = "//a[@title=\"Pay by check.\"]")
    private WebElement optionCheck;

    @FindBy(xpath = "//a[@title=\"Pay with PayPal\"]")
    private WebElement optionCardOrPaypal;

    @FindBy(xpath = "//h3")
    private WebElement labelPaymentName;

    @FindBy(xpath = "//span[@class=\"price\"]")
    private WebElement valuePrice;

    @FindBy(xpath = "//button[@class=\"btn pull-right button button-medium\"]")
    private WebElement buttonIConfirmMyOrder;

    public PaymentInformationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;
    }

    public void clickOnCheckboxAgreement(){
        checkboxAgreement.isDisplayed();
        checkboxAgreement.isEnabled();
        checkboxAgreement.click();
    }

    public void selectPayByBankWire(){
        optionBankWire.isDisplayed();
        optionBankWire.isEnabled();
        optionBankWire.click();
    }

    public void selectPayByCheck(){
        optionCheck.isDisplayed();
        optionCheck.isEnabled();
        optionCheck.click();
    }

    public void selectPayWithYourCardOrPaypal(){
        optionCardOrPaypal.isDisplayed();
        optionCardOrPaypal.isEnabled();
        optionCardOrPaypal.click();
    }

    public void clickOnIConfirmMyOrder(){
        labelPaymentName.isDisplayed();
        buttonIConfirmMyOrder.isDisplayed();
        buttonIConfirmMyOrder.isEnabled();
        buttonIConfirmMyOrder.click();
    }
}

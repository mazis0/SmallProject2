package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MyAccountPage {
    WebDriver driver;

    @FindBy(xpath = "//h1[.=\"My account\"]")
    private WebElement labelMyAccount;

    @FindBy(xpath = "//span[.=\"Add my first address\"]")
    private WebElement labelAddMyFirstAddress;

    @FindBy (xpath = "//span[.=\"Order history and details\"]")
    private WebElement labelOrderHistoryAndDetails;

    @FindBy(xpath = "//span[.=\"My credit slips\"]")
    private WebElement labelMyCreditSlips;

    @FindBy(xpath = "//span[.=\"My addresses\"]")
    private WebElement labelMyAddresses;

    @FindBy(xpath = "//span[.=\"My personal information\"]")
    private WebElement labelMyPersonalInformation;


    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;

    }

    public boolean isUserOnMyAccountPage(){
        labelMyAccount.isDisplayed();
        labelAddMyFirstAddress.isDisplayed();
        labelOrderHistoryAndDetails.isDisplayed();
        labelMyCreditSlips.isDisplayed();
        labelMyAddresses.isDisplayed();
        labelMyPersonalInformation.isDisplayed();
        return true;

    }
}

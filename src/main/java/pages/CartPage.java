package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CartPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class=\"accordion\"]/div[2]//a")
    private WebElement buttonProceed;

    @FindBy(xpath = "//div[@class=\"room-xs-info\"]/p[@class=\"product-name\"]/a")
    private WebElement labelRoomName;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;
    }

    public void clickOnProceed()throws InterruptedException{
        Thread.sleep(2000);
        buttonProceed.isDisplayed();
        buttonProceed.isEnabled();
        buttonProceed.click();
    }
}

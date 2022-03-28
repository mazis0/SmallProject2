package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class OrderConfirmationPage extends SearchPage{


    @FindBy(xpath = "//p[@class=\"alert alert-success\"]")
    private WebElement messageCompleteOrder;

    @FindBy(xpath = "//span[.=\"Confirmed\"]")
    private WebElement labelConfirmed;

    @FindBy(xpath = "//tfoot/tr[@class=\"item\"][2]/td[3]/span")
    private WebElement valueDueAmount;

    @FindBy(xpath = "//tfoot/tr[@class=\"item\"][1]/td[3]/span")
    private WebElement valueRoomsTaxInc;

    @FindBy(xpath = "//tfoot/tr[@class=\"totalprice item\"]/td[3]/span")
    private WebElement valueFinalBookingTotal;

    @FindBy(xpath = "//span[@class=\"bold\"]")
    private WebElement valueReference;

    public OrderConfirmationPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;
    }

    public void isOrderCompleted(){
        labelConfirmed.isDisplayed();
        messageCompleteOrder.isDisplayed();
    }

    public String getCompleteOrderMessage(){
        return messageCompleteOrder.getText();
    }



}

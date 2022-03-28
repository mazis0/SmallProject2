package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.junit.Assert;

import java.util.List;


public class SearchPage {
    WebDriver driver;
    @FindBy(xpath = "//input[@id=\"check_in_time\"]")
    private WebElement checkInTime;

    @FindBy(xpath = "//input[@id=\"check_out_time\"]")
    private WebElement checkOutTime;

    @FindBy(xpath = "//p[.=\"Sort By:\"]")
    private WebElement labelSortBy;

    @FindBy(xpath = "//button[@id=\"gst_rating\"]")
    private WebElement dropdownRating;

    @FindBy(xpath = "//button[@id=\"price_ftr\"]")
    private WebElement dropdownPrice;

    @FindBy(xpath = "//span[.=\"Book Now\"]")
    private WebElement buttonBookNow;

    @FindBy(xpath = "//span[@id=\"layer_cart_product_time_duration\"]")
    private WebElement timeDuration;

    @FindBy(xpath = "//p[.=\"General Rooms\"]/parent::div//input")
    private WebElement textAddQuantityGeneralRooms;

    @FindBy(xpath = "//p[.=\"Delux Rooms\"]/parent::div//input")
    private WebElement textAddQuantityDeluxeRooms;

    @FindBy(xpath = "//p[.=\"Executive Rooms\"]/parent::div//input")
    private WebElement textAddQuantityExecutiveRooms;

    @FindBy(xpath = "//p[.=\"luxury Rooms\"]/parent::div//input")
    private WebElement textAddQuantityLuxuryRooms;

    @FindBy(xpath = "//span[@id=\"layer_cart_product_quantity\"]")
    private WebElement valueLabelRoomQuantityAdded;

    @FindBy(xpath = "//p[.=\"Delux Rooms\"]//following-sibling::a/span")
    private WebElement buttonBookNowDeluxeRooms;

    @FindBy(xpath = "//p[.=\"Executive Rooms\"]//following-sibling::a/span")
    private WebElement buttonBookNowExecutiveRooms;

    @FindBy(xpath = "//p[.=\"luxury Rooms\"]//following-sibling::a/span")
    private WebElement buttonBookNowLuxuryRooms;

    @FindBy(xpath = "//p[.=\"General Rooms\"]//following-sibling::a/span")
    private WebElement buttonBookNowGeneralRooms;

    @FindBy(xpath = "//a[@class=\"btn btn-default button button-medium\"]")
    private WebElement buttonProceedToCheckout;

    @FindBy(xpath = "//div[@id=\"category_data_cont\"]/div[1]//span[@class=\"pull-left rm_price_val \"]")
    private WebElement valuePriceGeneralRooms;

    @FindBy(xpath = "//div[@id=\"category_data_cont\"]/div[2]//span[@class=\"pull-left rm_price_val \"]")
    private WebElement valuePriceDeluxeRooms;

    @FindBy(xpath = "//div[@id=\"category_data_cont\"]/div[3]//span[@class=\"pull-left rm_price_val \"]")
    private WebElement valuePriceExecutiveRooms;

    @FindBy(xpath = "//div[@id=\"category_data_cont\"]/div[4]//span[@class=\"pull-left rm_price_val \"]")
    private WebElement valuePriceLuxuryRooms;

    @FindBy(xpath = "//p[.=\"General Rooms\"]")
    private WebElement labelGeneralRoom;

    @FindBy(xpath = "//span[@id=\"layer_cart_product_price\"]")
    private WebElement valueLabelTotalCartCostOfThisRoom;

    @FindBy(xpath = "//div[@id=\"category_data_cont\"]/div[1]//span[@class=\"pull-left rm_price_val \"]")
    private WebElement valuePrice1;

    @FindBy(xpath = "//div[@id=\"category_data_cont\"]/div[2]//span[@class=\"pull-left rm_price_val \"]")
    private WebElement valuePrice2;

    @FindBy(xpath = "//div[@id=\"category_data_cont\"]/div[3]//span[@class=\"pull-left rm_price_val \"]")
    private WebElement valuePrice3;

    @FindBy(xpath = "//div[@id=\"category_data_cont\"]/div[4]//span[@class=\"pull-left rm_price_val \"]")
    private WebElement valuePrice4;

    @FindBy(xpath = "//div[@class=\"row margin-lr-0 catSortBlock\"]/div[3]//span[@class=\"pull-left sort_btn_span\"]")
    private WebElement dropDownPrice;

    @FindBy(xpath = "//a[.=\"Price : Lowest First\"]")
    private WebElement optionLowestFirst;

    @FindBy(xpath = "//a[.=\"Price : Highest first \"]")
    private WebElement optionHighestFirst;

    @FindBy(xpath = "//span[.=\"No room available for this hotel!\"]")
    private WebElement messageNoRoomAvailable;

    @FindBy(xpath = "//p[@class=\"rm_heading\"]")
    private List<WebElement> availableHotel;


    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;
    }

    public String getTextCheckInTime(){
        String checkindate = checkInTime.getAttribute("value");
        return checkindate;
    }

    public String getTextCheckOutTime(){
         String checkoutdate = checkOutTime.getAttribute("value");
         return checkoutdate;
    }

    public boolean verifySearchPage(){
        labelSortBy.isDisplayed();
        dropdownRating.isDisplayed();
        dropdownPrice.isDisplayed();
        return true;
    }

    public void clickOnBookNowDeluxeRooms()throws InterruptedException{
        buttonBookNowDeluxeRooms.isDisplayed();
        buttonBookNowDeluxeRooms.isEnabled();
        buttonBookNowDeluxeRooms.click();
        Thread.sleep(2000);
        String checkindate = checkInTime.getAttribute("value");
        String checkoutdate = checkOutTime.getAttribute("value");
        String expectedTimeDuration = checkindate + " " + "-" + " " + checkoutdate;
        String expectedQuantity = textAddQuantityDeluxeRooms.getAttribute("value");
        Assert.assertEquals(expectedTimeDuration,timeDuration.getText());
        Assert.assertEquals(expectedQuantity,valueLabelRoomQuantityAdded.getText());
    }

    public void clickOnBookNowExecutiveRooms()throws InterruptedException{
        buttonBookNowExecutiveRooms.isDisplayed();
        buttonBookNowExecutiveRooms.isEnabled();
        buttonBookNowExecutiveRooms.click();
        Thread.sleep(2000);
        String checkindate = checkInTime.getAttribute("value");
        String checkoutdate = checkOutTime.getAttribute("value");
        String expectedTimeDuration = checkindate + " " + "-" + " " + checkoutdate;
        String expectedQuantity = textAddQuantityExecutiveRooms.getAttribute("value");
        Assert.assertEquals(expectedTimeDuration,timeDuration.getText());
        Assert.assertEquals(expectedQuantity,valueLabelRoomQuantityAdded.getText());
    }

    public void clickOnBookNowLuxuryRooms()throws InterruptedException{
        buttonBookNowLuxuryRooms.isDisplayed();
        buttonBookNowLuxuryRooms.isEnabled();
        buttonBookNowLuxuryRooms.click();
        Thread.sleep(2000);
        String checkindate = checkInTime.getAttribute("value");
        String checkoutdate = checkOutTime.getAttribute("value");
        String expectedTimeDuration = checkindate + " " + "-" + " " + checkoutdate;
        String expectedQuantity = textAddQuantityLuxuryRooms.getAttribute("value");
        Assert.assertEquals(expectedTimeDuration,timeDuration.getText());
        Assert.assertEquals(expectedQuantity,valueLabelRoomQuantityAdded.getText());
    }
    public void clickOnBookNowGeneralRooms()throws InterruptedException{
        buttonBookNowGeneralRooms.isDisplayed();
        buttonBookNowGeneralRooms.isEnabled();
        buttonBookNowGeneralRooms.click();
        Thread.sleep(2000);
        String checkindate = checkInTime.getAttribute("value");
        String checkoutdate = checkOutTime.getAttribute("value");
        String expectedTimeDuration = checkindate + " " + "-" + " " + checkoutdate;
        String expectedQuantity = textAddQuantityGeneralRooms.getAttribute("value");
        Assert.assertEquals(expectedTimeDuration,timeDuration.getText());
        Assert.assertEquals(expectedQuantity,valueLabelRoomQuantityAdded.getText());
        Assert.assertEquals(valuePriceGeneralRooms.getText(),valueLabelTotalCartCostOfThisRoom.getText());
    }

    public void clickOnProceedToCheckout(){
        buttonProceedToCheckout.isDisplayed();
        buttonProceedToCheckout.isEnabled();
        buttonProceedToCheckout.click();
    }
    private boolean nilaiPrice1(){
        valuePrice1.isDisplayed();
        return true;
    }
    private boolean noRoomAvailable(){
        messageNoRoomAvailable.isDisplayed();
        return true;
    }
    private boolean nilaiPrice2(){
        valuePrice2.isDisplayed();
        return true;
    }

    private boolean nilaiPrice3(){
        valuePrice3.isDisplayed();
        return true;
    }

    private boolean nilaiPrice4(){
        valuePrice4.isDisplayed();
        return true;
    }

    public boolean verifyDropDownPriceHighest(){

        availableHotel.size();

                if (availableHotel.size() == 0) {

                    System.out.println("HOTEL TIDAK DITEMUKAN");
                    Assert.assertTrue(noRoomAvailable());

                } else if (availableHotel.size() == 1) {
                    boolean nilaiPrice1 = valuePrice1.isDisplayed();
                    System.out.println("HANYA 1 HOTEL DITEMUKAN");
                    Assert.assertTrue(nilaiPrice1);

                } else if (availableHotel.size() == 2) {
                    String valueListPrice1 = valuePrice1.getText();
                    valueListPrice1 = valueListPrice1.replaceAll("\\D+", "");
                    int valueListPrice1new = Integer.parseInt(valueListPrice1);
                    String valueListPrice2 = valuePrice2.getText();
                    valueListPrice2 = valueListPrice2.replaceAll("\\D+", "");
                    int valueListPrice2new = Integer.parseInt(valueListPrice2);
                    System.out.println(valueListPrice1new);
                    System.out.println(valueListPrice2new);
                    Assert.assertTrue(valueListPrice1new >= valueListPrice2new);
                    System.out.println("2 Hotel ditemukan");
                } else if (availableHotel.size() == 3) {
                    String valueListPrice1 = valuePrice1.getText();
                    valueListPrice1 = valueListPrice1.replaceAll("\\D+", "");
                    int valueListPrice1new = Integer.parseInt(valueListPrice1);
                    String valueListPrice2 = valuePrice2.getText();
                    valueListPrice2 = valueListPrice2.replaceAll("\\D+", "");
                    int valueListPrice2new = Integer.parseInt(valueListPrice2);
                    System.out.println(valueListPrice2new);
                    System.out.println(valueListPrice1new);
                    String valueListPrice3 = valuePrice3.getText();
                    valueListPrice3 = valueListPrice3.replaceAll("\\D+", "");
                    int valueListPrice3new = Integer.parseInt(valueListPrice3);
                    System.out.println(valueListPrice3new);
                    Assert.assertTrue(valueListPrice1new >= valueListPrice2new && valueListPrice1new >= valueListPrice3new);
                    Assert.assertTrue(valueListPrice2new >= valueListPrice3new);
                    System.out.println("3 Hotel Ditemukan");
                } else if (availableHotel.size() == 4) {
                    String valueListPrice1 = valuePrice1.getText();
                    valueListPrice1 = valueListPrice1.replaceAll("\\D+", "");
                    int valueListPrice1new = Integer.parseInt(valueListPrice1);
                    String valueListPrice2 = valuePrice2.getText();
                    valueListPrice2 = valueListPrice2.replaceAll("\\D+", "");
                    int valueListPrice2new = Integer.parseInt(valueListPrice2);
                    System.out.println(valueListPrice1new);
                    System.out.println(valueListPrice2new);
                    String valueListPrice3 = valuePrice3.getText();
                    valueListPrice3 = valueListPrice3.replaceAll("\\D+", "");
                    int valueListPrice3new = Integer.parseInt(valueListPrice3);
                    System.out.println(valueListPrice3new);
                    String valueListPrice4 = valuePrice4.getText();
                    valueListPrice4 = valueListPrice4.replaceAll("\\D+", "");
                    int valueListPrice4new = Integer.parseInt(valueListPrice4);
                    System.out.println(valueListPrice4new);
                    Assert.assertTrue(valueListPrice1new >= valueListPrice2new && valueListPrice1new >= valueListPrice3new && valueListPrice1new >= valueListPrice4new);
                    Assert.assertTrue(valueListPrice2new >= valueListPrice3new && valueListPrice2new >= valueListPrice4new);
                    Assert.assertTrue(valueListPrice3new >= valueListPrice4new);
                    System.out.println("4 Hotel ditemukan");
                }






        return true;


    }
    public boolean verifyDropDownPriceLowest(){

        availableHotel.size();

        if (availableHotel.size() == 0) {

            System.out.println("HOTEL TIDAK DITEMUKAN");
            Assert.assertTrue(noRoomAvailable());

        } else if (availableHotel.size() == 1) {
            boolean nilaiPrice1 = valuePrice1.isDisplayed();
            System.out.println("HANYA 1 HOTEL DITEMUKAN");
            Assert.assertTrue(nilaiPrice1);

        } else if (availableHotel.size() == 2) {
            String valueListPrice1 = valuePrice1.getText();
            valueListPrice1 = valueListPrice1.replaceAll("\\D+", "");
            int valueListPrice1new = Integer.parseInt(valueListPrice1);
            String valueListPrice2 = valuePrice2.getText();
            valueListPrice2 = valueListPrice2.replaceAll("\\D+", "");
            int valueListPrice2new = Integer.parseInt(valueListPrice2);
            System.out.println(valueListPrice1new);
            System.out.println(valueListPrice2new);
            Assert.assertTrue(valueListPrice1new <= valueListPrice2new);
            System.out.println("2 Hotel ditemukan");
        } else if (availableHotel.size() == 3) {
            String valueListPrice1 = valuePrice1.getText();
            valueListPrice1 = valueListPrice1.replaceAll("\\D+", "");
            int valueListPrice1new = Integer.parseInt(valueListPrice1);
            String valueListPrice2 = valuePrice2.getText();
            valueListPrice2 = valueListPrice2.replaceAll("\\D+", "");
            int valueListPrice2new = Integer.parseInt(valueListPrice2);
            System.out.println(valueListPrice2new);
            System.out.println(valueListPrice1new);
            String valueListPrice3 = valuePrice3.getText();
            valueListPrice3 = valueListPrice3.replaceAll("\\D+", "");
            int valueListPrice3new = Integer.parseInt(valueListPrice3);
            System.out.println(valueListPrice3new);
            Assert.assertTrue(valueListPrice1new <= valueListPrice2new && valueListPrice1new <= valueListPrice3new);
            Assert.assertTrue(valueListPrice2new <= valueListPrice3new);
            System.out.println("3 Hotel Ditemukan");
        } else if (availableHotel.size() == 4) {
            String valueListPrice1 = valuePrice1.getText();
            valueListPrice1 = valueListPrice1.replaceAll("\\D+", "");
            int valueListPrice1new = Integer.parseInt(valueListPrice1);
            String valueListPrice2 = valuePrice2.getText();
            valueListPrice2 = valueListPrice2.replaceAll("\\D+", "");
            int valueListPrice2new = Integer.parseInt(valueListPrice2);
            System.out.println(valueListPrice1new);
            System.out.println(valueListPrice2new);
            String valueListPrice3 = valuePrice3.getText();
            valueListPrice3 = valueListPrice3.replaceAll("\\D+", "");
            int valueListPrice3new = Integer.parseInt(valueListPrice3);
            System.out.println(valueListPrice3new);
            String valueListPrice4 = valuePrice4.getText();
            valueListPrice4 = valueListPrice4.replaceAll("\\D+", "");
            int valueListPrice4new = Integer.parseInt(valueListPrice4);
            System.out.println(valueListPrice4new);
            Assert.assertTrue(valueListPrice1new <= valueListPrice2new && valueListPrice1new <= valueListPrice3new && valueListPrice1new <= valueListPrice4new);
            Assert.assertTrue(valueListPrice2new <= valueListPrice3new && valueListPrice2new <= valueListPrice4new);
            Assert.assertTrue(valueListPrice3new <= valueListPrice4new);
            System.out.println("4 Hotel ditemukan");
        }






        return true;

    }
    public void clickOnLowestPrice(){
        dropDownPrice.click();
        optionLowestFirst.click();
    }

    public void clickOnHighestPrice(){
        dropDownPrice.click();
        optionHighestFirst.click();
    }
}

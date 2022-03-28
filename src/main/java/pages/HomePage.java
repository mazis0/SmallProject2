package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.XMLFormatter;


public class HomePage {
    WebDriver driver;


    @FindBy(xpath = "//p[.=\"Welcome To\"]")
    private WebElement labelWelcomeTo;

    @FindBy(xpath = "//h1[.=\"Hotel Dominic Parks\"]")
    private WebElement labelHotelDominicParks;

    @FindBy(xpath = "//span[.=\"Sign in\"]")
    private WebElement buttonSignIn;

    @FindBy(xpath = "//span[@id=\"hotel_cat_name\"]")
    private WebElement selectHotel;

    @FindBy(xpath = "//input[@id=\"hotel_location\"]")
    private WebElement textHotelLocation;

    @FindBy(xpath = "//input[@id=\"check_in_time\"]")
    private WebElement labelSelectInDate;

    @FindBy(xpath = "//ul[@class=\"location_search_results_ul\"]")
    private WebElement dropDownTextHotelLocation;

    @FindBy(xpath = "//li[@class=\"search_result_li\"]")
    private WebElement dropDownSelectHotel;

    @FindBy(xpath = "//button[@id=\"search_room_submit\"]")
    private WebElement searchNowButton;

    @FindBy(xpath = "//div[@id=\"hotelInteriorBlock\"]//div[@class=\"owl-stage\"]//div/descendant::img")
    private List<WebElement> listImageInterior;

    @FindBy(xpath = "//p[.=\"Interior\"]")
    private WebElement labelInterior;

    @FindBy(xpath = "//p[.=\"Interior\"]/following-sibling::p")
    private WebElement labelInteriorDescriptions;

    @FindBy(xpath = "//button[@class=\"nav_toggle\"]")
    private WebElement buttonMenu;

    @FindBy(xpath = "//a[.=\"Interior\"]")
    private WebElement buttonMenuInterior;

    @FindBy(xpath = "//a[.=\"Amenities\"]")
    private WebElement buttonMenuAmenities;

    @FindBy(xpath = "//a[.=\"Rooms\"]")
    private WebElement buttonMenuRooms;

    @FindBy(xpath = "//a[.=\"Testimonials\"]")
    private WebElement buttonMenuTestimonials;

    @FindBy(xpath = "//a[.=\"Legal Notice\"]")
    private WebElement buttonMenuLegalNotice;

    @FindBy(xpath = "//div[@class=\"row\"]/ul[1]//a[.=\"About us\"]")
    private WebElement buttonMenuAboutUs;

    @FindBy(xpath = "//a[.=\"Contact\"]")
    private WebElement buttonMenuContact;

    @FindBy(xpath = "//p[.=\"Amenities\"]")
    private WebElement labelAmenities;

    @FindBy(xpath = "//p[.=\"Amenities\"]/following-sibling::p")
    private WebElement labelAmenitiesDescriptions;

    @FindBy(xpath = "//div[@id=\"hotelRoomsBlock\"]//div/descendant::img")
    private List<WebElement> listImageOutRooms;

    @FindBy(xpath = "//p[.=\"Our Rooms\"]")
    private WebElement labelOurRooms;

    @FindBy(xpath = "//p[.=\"Our Rooms\"]/following-sibling::p")
    private WebElement labelOurRoomsDescriptions;

    @FindBy(xpath = "//a[@href='http://qa.cilsy.id:8080/en/the-hotel-prime/2-super-delux-rooms.html']")
    private WebElement buttonBookNowDeluxeRoom;

    @FindBy(xpath = "//a[@href='http://qa.cilsy.id:8080/en/the-hotel-prime/3-super-delux-rooms.html']")
    private WebElement buttonBookNowExecutiveRoom;

    @FindBy(xpath = "//a[@href='http://qa.cilsy.id:8080/en/the-hotel-prime/1-super-delux-rooms.html']")
    private WebElement buttonBookNowGeneralRoom;

    @FindBy(xpath = "//a[@href='http://qa.cilsy.id:8080/en/the-hotel-prime/4-super-delux-rooms.html']")
    private WebElement buttonBookNowLuxuryRoom;

    @FindBy(xpath = "//p[.=\"Delux Rooms\"]")
    private WebElement labelDeluxRooms;

    @FindBy(xpath = "//p[.=\"Delux Rooms\"]/following-sibling::p/child::span")
    private WebElement labelPriceDeluxRooms;

    @FindBy(xpath = "//p[.=\"Executive Rooms\"]")
    private WebElement labelExecutiveRooms;

    @FindBy(xpath = "//p[.=\"Executive Rooms\"]/following-sibling::p/child::span")
    private WebElement labelPriceExecutiveRooms;

    @FindBy(xpath = "//p[.=\"General Rooms\"]")
    private WebElement labelGeneralRooms;

    @FindBy(xpath = "//p[.=\"General Rooms\"]/following-sibling::p/child::span")
    private WebElement labelPriceGeneralRooms;

    @FindBy(xpath = "//p[.=\"luxury Rooms\"]")
    private WebElement labelLuxuryRooms;

    @FindBy(xpath = "//p[.=\"luxury Rooms\"]/following-sibling::p/child::span")
    private WebElement labelPriceLuxuryRooms;

    @FindBy(xpath = "//p[.=\"luxury Rooms\"]/parent::div/following-sibling::div[1]")
    private WebElement labelLuxuryRoomsDescriptions;

    @FindBy(xpath = "//p[.=\"General Rooms\"]/parent::div/following-sibling::div[1]")
    private WebElement labelGeneralRoomsDescriptions;

    @FindBy(xpath = "//p[.=\"Executive Rooms\"]/parent::div/following-sibling::div[1]")
    private WebElement labelExecutiveRoomsDescriptions;

    @FindBy(xpath = "//p[.=\"Delux Rooms\"]/parent::div/following-sibling::div[1]")
    private WebElement labelDeluxRoomsDescriptions;

    @FindBy(xpath = "//p[.=\"What our Guest say?\"]")
    private WebElement labelWhatOurGuestSay;

    @FindBy(xpath = "//p[.=\"What our Guest say?\"]/following-sibling::p")
    private WebElement labelWhatOurGuestSayDescriptions;

    @FindBy(xpath = "//div[@class='owl-item active']//p[@class='testimonialContentText']")
    private WebElement testimonialMessage;

    @FindBy(xpath = "//div[@class='owl-item active']//p[@class='testimonialPersonName']")
    private WebElement labelNameCalrkKent;

    @FindBy(xpath = "//div[@class='owl-item active']//p[@class='testimonialPersonName']/following-sibling::p")
    private WebElement labelNameJanComicsJoe;

    @FindBy(xpath = "//div[@class='owl-item active']//p[@class='testimonialPersonName']/preceding-sibling::img")
    private WebElement imageJanComicsJoe;

    @FindBy(xpath = "//h2[.=\"Legal\"]")
    private WebElement labelLegal;

    @FindBy(xpath = "//h3[.=\"Credits\"]")
    private WebElement labelCredits;

    @FindBy(xpath = "//h3[.=\"Credits\"]/following-sibling::p[2]")
    private WebElement labelLegalDescriptions;

    @FindBy(xpath = "//p[.=\"Concept and production:\"]")
    private WebElement labelConceptAndProduction;

    @FindBy(xpath = "//input[@id=\"check_out_time\"]")
    private WebElement textCheckoutTime;

    @FindBy(xpath = "//input[@id=\"check_in_time\"]")
    private WebElement textCheckInTime;



    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
        this.driver = driver;

    }

    public boolean isUserOnHomePage(){
        labelWelcomeTo.isDisplayed();
        labelHotelDominicParks.isDisplayed();
        return true;
    }

    public void clickOnButtonSignIn(){
        buttonSignIn.isDisplayed();
        buttonSignIn.isEnabled();
        buttonSignIn.click();
    }

    public void selectCheckInDate(String date)throws Exception{
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", textCheckInTime);
        textCheckInTime.sendKeys(date);
    }

    public void enterLocation(String location)throws InterruptedException{

        textHotelLocation.sendKeys(location);
   //     dropDownTextHotelLocation.click();
       JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",dropDownTextHotelLocation);


    }

    public void selectCheckOutDate(String date)throws Exception{

        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", textCheckoutTime);
        textCheckoutTime.sendKeys(date);
    }

    public void selectHotel()throws InterruptedException{

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",selectHotel);

        js.executeScript("arguments[0].click();",dropDownSelectHotel);


    }

    public void clickOnSearchNowButton()throws InterruptedException{

        searchNowButton.click();
    }

    public boolean verifyMenuInterior(){
        labelInterior.isDisplayed();
        labelInteriorDescriptions.isDisplayed();
        int expectedImage = 30;
        Assert.assertEquals(expectedImage,listImageInterior.size());
        return true;
    }

    public void clickOnButtonInterior(){
        buttonMenuInterior.isDisplayed();
        buttonMenuInterior.isEnabled();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",buttonMenuInterior);
    }

    public void clickOnButtonAmenities(){
        buttonMenuAmenities.isDisplayed();
        buttonMenuAmenities.isEnabled();
        buttonMenuAmenities.click();
    }
    public void clickOnButtonRooms(){
        buttonMenuRooms.isDisplayed();
        buttonMenuRooms.isEnabled();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",buttonMenuRooms);

    }

    public void clickOnButtonTestimonial(){
        buttonMenuTestimonials.isDisplayed();
        buttonMenuTestimonials.isEnabled();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",buttonMenuTestimonials);
    }
    public void clickOnButtonLegalNotice(){
        buttonMenuLegalNotice.isDisplayed();
        buttonMenuLegalNotice.isEnabled();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",buttonMenuLegalNotice);
    }

    public void clickOnButtonAboutUs(){
        buttonMenuAboutUs.isDisplayed();
        buttonMenuAboutUs.isEnabled();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",buttonMenuAboutUs);
    }

    public void clickOnButtonContact(){
        buttonMenuContact.isDisplayed();
        buttonMenuContact.isEnabled();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",buttonMenuContact);
    }

    public boolean verifyMenuOurRoom(){
        labelOurRooms.isDisplayed();
        labelOurRoomsDescriptions.isDisplayed();
        labelDeluxRooms.isDisplayed();
        labelDeluxRoomsDescriptions.isDisplayed();
        labelPriceDeluxRooms.isDisplayed();
        labelExecutiveRooms.isDisplayed();
        labelExecutiveRoomsDescriptions.isDisplayed();
        labelPriceExecutiveRooms.isDisplayed();
        labelGeneralRooms.isDisplayed();
        labelGeneralRoomsDescriptions.isDisplayed();
        labelPriceGeneralRooms.isDisplayed();
        labelLuxuryRooms.isDisplayed();
        labelLuxuryRoomsDescriptions.isDisplayed();
        labelPriceLuxuryRooms.isDisplayed();
        buttonBookNowDeluxeRoom.isEnabled();
        buttonBookNowExecutiveRoom.isEnabled();
        buttonBookNowGeneralRoom.isEnabled();
        buttonBookNowLuxuryRoom.isEnabled();
        int expectedImage = 4;
        int actualImage = listImageOutRooms.size();
        Assert.assertEquals(expectedImage,actualImage);
        return true;
    }

    public void clickOnMenu(){
        buttonMenu.isDisplayed();
        buttonMenu.isEnabled();
        buttonMenu.click();
    }

    public boolean verifyTestimonials(){
        labelWhatOurGuestSay.isDisplayed();
        labelWhatOurGuestSayDescriptions.isDisplayed();
        testimonialMessage.isDisplayed();
        labelNameCalrkKent.isDisplayed();
        labelNameJanComicsJoe.isDisplayed();
        imageJanComicsJoe.isDisplayed();
        return true;
    }

    public boolean verifyLegal(){
        labelLegal.isDisplayed();
        labelCredits.isDisplayed();
        labelConceptAndProduction.isDisplayed();
        labelLegalDescriptions.isDisplayed();
        return true;
    }

}

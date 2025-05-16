package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageGenerator {
    public static HomePageObject getHomePage(WebDriver driver){
        return new HomePageObject(driver);
    }
    public static RegisterPageObject getRegisterPage(WebDriver driver){
        return new RegisterPageObject(driver);
    }
    public static MyAccountObject getMyAccountPage(WebDriver driver){
        return new MyAccountObject(driver);
    }
    public static AddressBookPageObject getAddressPage(WebDriver driver){return new AddressBookPageObject(driver);}
    public static OrderPageObject getOrderPage(WebDriver driver){return new OrderPageObject(driver);}
}

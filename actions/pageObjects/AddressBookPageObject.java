package pageObjects;

import org.openqa.selenium.WebDriver;
import commons.BasePage;
import pageUIs.AddressBookPageUI;
import pageUIs.MyAccountUI;

public class AddressBookPageObject extends BasePage {
    WebDriver driver;
    public AddressBookPageObject(WebDriver driver){
        this.driver = driver;
    }


}

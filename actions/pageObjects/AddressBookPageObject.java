package pageObjects;

import org.openqa.selenium.WebDriver;
import commons.BasePage;
import pageUIs.AddressBookPageUI;
import pageUIs.MyAccountUI;

public class AddressBookPageObject extends SidebarPageObject {
    WebDriver driver;
    public AddressBookPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


}

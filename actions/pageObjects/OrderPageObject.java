package pageObjects;

import org.openqa.selenium.WebDriver;
import commons.BasePage;
import pageUIs.OrderPageUI;

public class OrderPageObject extends SidebarPageObject {
    WebDriver driver;
    public OrderPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


}

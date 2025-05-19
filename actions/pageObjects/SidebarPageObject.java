package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.BasePageUI;
import pageUIs.SidebarPageUI;

public class SidebarPageObject extends BasePage {
    WebDriver driver;

    public SidebarPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public OrderPageObject openOrderPage() {
        waitForElementClickable(driver, SidebarPageUI.ORDER_LINK);
        clickToElement(driver, SidebarPageUI.ORDER_LINK);
        return PageGenerator.getOrderPage(driver);
    }

    public AddressBookPageObject openAdressPage() {
        waitForElementClickable(driver, SidebarPageUI.ADDRESS_BOOK_LINK);
        clickToElement(driver, SidebarPageUI.ADDRESS_BOOK_LINK);
        return PageGenerator.getAddressPage(driver);
    }

    public MyAccountObject openMyAccountPage() {
        waitForElementClickable(driver, SidebarPageUI.MYACCOUNT_LINK);
        clickToElement(driver, SidebarPageUI.MYACCOUNT_LINK);
        return PageGenerator.getMyAccountPage(driver);
    }
}

package pageObjects.user;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageUIs.user.UserSidebarPageUI;

public class UserSidebarPO extends BasePage {
    WebDriver driver;

    public UserSidebarPO(WebDriver driver) {
        this.driver = driver;
    }
    public UserOrderPO openOrderPage() {
        waitForElementClickable(driver, UserSidebarPageUI.ORDER_LINK);
        clickToElement(driver, UserSidebarPageUI.ORDER_LINK);
        return PageGenerator.getUserOrderPage(driver);
    }

    public UserAddressBookPO openAdressPage() {
        waitForElementClickable(driver, UserSidebarPageUI.ADDRESS_BOOK_LINK);
        clickToElement(driver, UserSidebarPageUI.ADDRESS_BOOK_LINK);
        return PageGenerator.getUserAddressPage(driver);
    }

    public UserMyAccountPO openMyAccountPage() {
        waitForElementClickable(driver, UserSidebarPageUI.MYACCOUNT_LINK);
        clickToElement(driver, UserSidebarPageUI.MYACCOUNT_LINK);
        return PageGenerator.getUserMyAccountPage(driver);
    }
}

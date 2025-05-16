package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.AddressBookPageUI;
import pageUIs.MyAccountUI;

public class MyAccountObject extends BasePage {
    private WebDriver driver;

    public MyAccountObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessRegister() {
        return getElementText(driver, MyAccountUI.REGISTER_SUCCESS_MESSAGE);
    }

    public String getContactInfo() {
        return getElementText(driver, MyAccountUI.CONTACT_INFO_LABEL);
    }

    public void clickAccountLink() {
        waitForElementClickable(driver, MyAccountUI.ACCOUNT_LINK);
        clickToElement(driver, MyAccountUI.ACCOUNT_LINK);
    }

    public MyAccountObject openMyAccountPage() {
        waitForElementClickable(driver, MyAccountUI.MYACCOUNT_LINK);
        clickToElement(driver, MyAccountUI.MYACCOUNT_LINK);
        return PageGenerator.getMyAccountPage(driver);
    }


}

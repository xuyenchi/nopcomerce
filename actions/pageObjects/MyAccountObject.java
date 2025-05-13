package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
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
    }

    public void clickMyAccountLink() {
    }
}

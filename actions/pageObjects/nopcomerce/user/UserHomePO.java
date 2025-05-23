package pageObjects.nopcomerce.user;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.nopcomerce.PageGenerator;
import pageUIs.user.UserHomePageUI;

public class UserHomePO extends BasePage {
    private WebDriver driver;
    public UserHomePO(WebDriver driver){
        this.driver = driver;
    }
    public UserRegisterPO openRegisterPage() {
        waitForElementClickable(driver, UserHomePageUI.MYACCOUNT_LINK);
        clickToElement(driver, UserHomePageUI.MYACCOUNT_LINK);

        waitForElementClickable(driver, UserHomePageUI.REGISTER_LINK);
        clickToElement(driver, UserHomePageUI.REGISTER_LINK);

        return PageGenerator.getUserRegisterPage(driver);
    }
}

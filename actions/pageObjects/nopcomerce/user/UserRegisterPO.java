package pageObjects.nopcomerce.user;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.nopcomerce.PageGenerator;
import pageUIs.user.UserRegisterPageUI;

public class UserRegisterPO extends BasePage {
    private WebDriver driver;

    public UserRegisterPO(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstnameTextbox(String key) {
        senkeyToElement(driver, UserRegisterPageUI.FIRSTNAME_TEXTBOX, key);

    }

    public void enterMiddlenameTextbox(String key) {
        senkeyToElement(driver, UserRegisterPageUI.MIDDLENAME_TEXTBOX, key);
    }

    public void enterLastnameTextbox(String key) {
        senkeyToElement(driver, UserRegisterPageUI.LASTNAME_TEXTBOX, key);
    }

    public void enterEmailTextbox(String key) {
        senkeyToElement(driver, UserRegisterPageUI.EMAIL_TEXTBOX, key);
    }

    public void enterPasswordTextbox(String key) {
        senkeyToElement(driver, UserRegisterPageUI.PASSWORD_TEXTBOX, key);
    }

    public void enterConfirmPasswordTextbox(String key) {
        senkeyToElement(driver, UserRegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, key);
    }

    public UserMyAccountPO clickRegisterButon() {
        clickToElement(driver, UserRegisterPageUI.REGISTER_BUTTON);
        return PageGenerator.getUserMyAccountPage(driver);
    }
}

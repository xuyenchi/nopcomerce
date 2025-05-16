package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends BasePage {
    private WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstnameTextbox(String key) {
        senkeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, key);

    }

    public void enterMiddlenameTextbox(String key) {
        senkeyToElement(driver, RegisterPageUI.MIDDLENAME_TEXTBOX, key);
    }

    public void enterLastnameTextbox(String key) {
        senkeyToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, key);
    }

    public void enterEmailTextbox(String key) {
        senkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, key);
    }

    public void enterPasswordTextbox(String key) {
        senkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, key);
    }

    public void enterConfirmPasswordTextbox(String key) {
        senkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, key);
    }

    public MyAccountObject clickRegisterButon() {
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
        return PageGenerator.getMyAccountPage(driver);
    }
}

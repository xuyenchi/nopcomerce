package com.nopcomerce.user;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.nopcomerce.user.UserHomePO;
import pageObjects.nopcomerce.user.UserMyAccountPO;
import pageObjects.nopcomerce.PageGenerator;
import pageObjects.nopcomerce.user.UserRegisterPO;

public class User_01_Lv7_Page_Generator extends BaseTest {
    WebDriver driver;
    private UserHomePO homePageObject;
    private UserRegisterPO registerPageObject;
    private UserMyAccountPO myAccountObject;
    String firstname = "Le";
    String middlename = "Ngoc";
    String lastname = "Xuyen";
    String email_address = "xuyen" + generateRandomNumber() + "@gmail.com";
    String password = "123456";
    String fullname = firstname + " " + middlename + " " + lastname;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserName(browserName);
        homePageObject = PageGenerator.getHomePage(driver);
    }

    @Test
    public void TC_01_Register_Techpanda() {

        registerPageObject = homePageObject.openRegisterPage();

        //qua trang register
        registerPageObject.enterFirstnameTextbox(firstname);
        registerPageObject.enterMiddlenameTextbox(middlename);
        registerPageObject.enterLastnameTextbox(lastname);
        registerPageObject.enterEmailTextbox(email_address);
        registerPageObject.enterPasswordTextbox(password);
        registerPageObject.enterConfirmPasswordTextbox(password);
        myAccountObject = registerPageObject.clickRegisterButon();

        //qua trang my account
        Assert.assertEquals(myAccountObject.getSuccessRegister(), "Thank you for registering with Main Website Store.");
        Assert.assertTrue(myAccountObject.getContactInfo().contains(fullname));
        Assert.assertTrue(myAccountObject.getContactInfo().contains(email_address));


    }

    @Test
    public void TC_02_MyAccount() throws InterruptedException {
        myAccountObject.clickAccountLink();
        myAccountObject = myAccountObject.openMyAccountPage();
        Thread.sleep(3000);
    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}

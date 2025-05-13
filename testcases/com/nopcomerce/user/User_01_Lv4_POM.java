package com.nopcomerce.user;

import commons.BasePage;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomePageObject;
import pageObjects.MyAccountObject;
import pageObjects.RegisterPageObject;

import java.time.Duration;
import java.util.Random;

public class User_01_Lv4_POM extends BaseTest {
    WebDriver driver;
    private HomePageObject homePageObject;
    private RegisterPageObject registerPageObject;
    private MyAccountObject myAccountObject;
    String firstname = "Le";
    String middlename = "Ngoc";
    String lastname = "Xuyen";
    String email_address = "xuyen" + generateRandomNumber() + "@gmail.com";
    String password = "123456";
    String fullname = firstname + " " + middlename + " " + lastname;

    @BeforeClass
    public void beforeClass() {

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //driver.get("https://demo.nopcommerce.com/");
        driver.get("http://live.techpanda.org/");
        homePageObject = new HomePageObject(driver);
    }

    @Test
    public void TC_01_Register_Techpanda() {

        homePageObject.clickRegisterLink();

        //qua trang register
        registerPageObject = new RegisterPageObject(driver);
        registerPageObject.enterFirstnameTextbox(firstname);
        registerPageObject.enterMiddlenameTextbox(middlename);
        registerPageObject.enterLastnameTextbox(lastname);
        registerPageObject.enterEmailTextbox(email_address);
        registerPageObject.enterPasswordTextbox(password);
        registerPageObject.enterConfirmPasswordTextbox(password);
        registerPageObject.clickRegisterButon();

        //qua trang my account
        myAccountObject = new MyAccountObject(driver);
        Assert.assertEquals(myAccountObject.getSuccessRegister(), "Thank you for registering with Main Website Store.");
        Assert.assertTrue(myAccountObject.getContactInfo().contains(fullname));
        Assert.assertTrue(myAccountObject.getContactInfo().contains(email_address));


    }

    @Test
    public void TC_02_MyAccount() throws InterruptedException {
        myAccountObject.clickAccountLink();
        myAccountObject.clickMyAccountLink();
        myAccountObject = new MyAccountObject(driver);


        Thread.sleep(3000);
    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}

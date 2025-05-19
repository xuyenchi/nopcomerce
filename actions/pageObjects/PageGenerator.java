package pageObjects;

import org.openqa.selenium.WebDriver;
import pageObjects.admin.AdminDashboardPO;
import pageObjects.admin.AdminLoginPO;
import pageObjects.user.*;

public class PageGenerator {
    public static UserHomePO getHomePage(WebDriver driver){
        return new UserHomePO(driver);
    }
    public static UserRegisterPO getUserRegisterPage(WebDriver driver){
        return new UserRegisterPO(driver);
    }
    public static UserMyAccountPO getUserMyAccountPage(WebDriver driver){
        return new UserMyAccountPO(driver);
    }
    public static UserAddressBookPO getUserAddressPage(WebDriver driver){return new UserAddressBookPO(driver);}
    public static UserOrderPO getUserOrderPage(WebDriver driver){return new UserOrderPO(driver);}
    public static AdminLoginPO getAdminLoginPage(WebDriver driver){
        return new AdminLoginPO(driver);
    }
    public static AdminDashboardPO getAdminDashboardPage(WebDriver driver){
        return new AdminDashboardPO(driver);
    }
}

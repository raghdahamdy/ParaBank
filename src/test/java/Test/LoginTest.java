package Test;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
//done
public class LoginTest extends BaseTest{
    @Test
    public void Login() {
     new LoginPage(driver).login("lolihossam","Lucinda@2015").secondlogin("lolihossam","Lucinda@2015");
        boolean isHeaderDisplayed = driver.findElement(LoginPage.getaccountOverview()).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);
    }
    }


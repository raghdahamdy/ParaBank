package Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.NewAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;
//done
public class NewAccountTest extends BaseTest{
    @Test
    public void NewAccount() {
         new LoginPage(driver).login("lolihossam","Lucinda@2015").secondlogin("lolihossam","Lucinda@2015").newAccount().accounttype()
                 .ammountt().newaccountbutton();



boolean isHeaderDisplayed = driver.findElement(NewAccountPage.getAccountOpened()).isDisplayed();
Assert.assertTrue(isHeaderDisplayed);
}}

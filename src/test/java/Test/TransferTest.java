package Test;

import Pages.EditInfoPage;
import Pages.LoginPage;
import Pages.PayBillPage;
import Pages.TransferPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferTest extends BaseTest{
    @Test
    public void trnsferfunds (){
        new LoginPage(driver).login("lolihossam","Lucinda@2015").secondlogin("lolihossam","Lucinda@2015").newAccount().accounttype()
                .ammountt().newaccountbutton().transferlink().TransferFunds("300","15009","15009").finaltransfer();

        boolean isHeaderDisplayed = driver.findElement(TransferPage.getTransferComplete()).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);

}}

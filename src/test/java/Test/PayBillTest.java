package Test;

import Pages.LoginPage;
import Pages.NewAccountPage;
import Pages.PayBillPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PayBillTest extends BaseTest{
    @Test
    public void Paybill() {
        new LoginPage(driver).login("lolihossam","Lucinda@2015").secondlogin("lolihossam","Lucinda@2015").newAccount().accounttype()
                .ammountt().newaccountbutton().transferlink().TransferFunds("300","15009","15009").finaltransfer()
                .payBillCse().completePayBill("lolihossam","Helwan","Cairo","Cairo","1234","01023122633","1234","1234","500","13788").finalPaymentButton();
        boolean isHeaderDisplayed = driver.findElement(PayBillPage.getBillPaymentComplete()).isDisplayed();
 Assert.assertTrue(isHeaderDisplayed);
}}

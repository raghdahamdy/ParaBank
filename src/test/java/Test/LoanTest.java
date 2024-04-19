package Test;

import Pages.LoanPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoanTest extends BaseTest{
    @Test
    public void applyForLoan() {
        new LoginPage(driver).login("lolihossam","Lucinda@2015").secondlogin("lolihossam","Lucinda@2015").newAccount().accounttype()
                .ammountt().newaccountbutton().transferlink().TransferFunds("300").finaltransfer()
                .payBillCse().completePayBill("lolihossam","Helwan","Cairo","Cairo","1234","01023122633","1234","1234","500","13788").finalPaymentButton()
                .update("lucinda","hossam","helwan","cairo","cairo","1234","01025155944").finalUpdate().applyLoan().
                apllyForLoan("122","12","13788").finalApplyButton();
        boolean isHeaderDisplayed = driver.findElement(LoanPage.getRequestProcessed()).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);

}}

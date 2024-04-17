package Test;

import Pages.EditInfoPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
//done
public class EditInfoTest extends BaseTest{
    @Test
    public void updatte (){
        new LoginPage(driver).login("lolihossam","Lucinda@2015").secondlogin("lolihossam","Lucinda@2015").newAccount().accounttype()
                .ammountt().newaccountbutton().transferlink().TransferFunds("300","15009","15009").finaltransfer()
                .payBillCse().completePayBill("lolihossam","Helwan","Cairo","Cairo","1234","01023122633","1234","1234","500","13788").finalPaymentButton()
                .update("lucinda","hossam","helwan","cairo","cairo","1234","01025155944").finalUpdate();

        boolean isHeaderDisplayed = driver.findElement(EditInfoPage.EditInfoPage()).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);
    }


}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PayBillPage {
    private WebDriver driver;

    public PayBillPage (WebDriver driver){
        this.driver=driver;
    }


    private By payBillSelector =By.xpath("//a[text()='Bill Pay']");
    //*[@id="leftPanel"]/ul/li[4]/a
    private By PayeeName= By.xpath("//input[@name='payee.name']");
    private By AddressPay= By.xpath("//input[@name='payee.address.street']");
    private By CityPay= By.xpath("//input[@name='payee.address.city']");
    private By StatePay= By.xpath("//input[@name='payee.address.state']");
    private By ZipCodePay= By.xpath("//input[@name='payee.address.zipCode']");
    private By PhonePay = By.xpath("//input[@name='payee.phoneNumber']");
    private By AccountPay = By.xpath("//input[@name='payee.accountNumber']");
    private By VerifyAccountPay= By.xpath("//input[@name='verifyAccount']");
    private By AmountPay= By.xpath("//input[@name='amount']");
    //private By FromaccountPay= By.xpath("//option[@value='13788']");
private By FromaccountPay= By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[13]/td[2]/select/option[3]");
    private By sendPaymentButton= By.xpath("//input[@type='submit']");
    private static By BillPaymentComplete= By.xpath("//h1[text()='Bill Payment Service']");
    public static By getBillPaymentComplete() {
        return BillPaymentComplete;}

    public PayBillPage payBillCse (){
        driver.findElement(payBillSelector).click();
        return this;
    }
    public PayBillPage completePayBill (String Payeename,String Addresspay,String Citpay, String Statepay
            ,String ZipCodepay,
                          String Phonepay,String Accountpay, String VerifyAccountpay,String Amountpay ,String Fromaccountpay) {
        driver.findElement(PayeeName).sendKeys(Payeename);
        driver.findElement(AddressPay).sendKeys(Addresspay);
        driver.findElement(CityPay).sendKeys(Citpay);
        driver.findElement(StatePay).sendKeys(Statepay);
        driver.findElement(ZipCodePay).sendKeys(ZipCodepay);
        driver.findElement(PhonePay).sendKeys(Phonepay);
        driver.findElement(AccountPay).sendKeys(Accountpay);
        driver.findElement(VerifyAccountPay).sendKeys(VerifyAccountpay);
        driver.findElement(AmountPay).sendKeys(Amountpay);
        driver.findElement(FromaccountPay).sendKeys(Fromaccountpay);
        return this;
    }
    public EditInfoPage  finalPaymentButton(){
        driver.findElement(sendPaymentButton).click();
        return new EditInfoPage(driver);


}}

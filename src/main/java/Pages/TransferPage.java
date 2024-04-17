package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferPage {
    private WebDriver driver;

    public TransferPage (WebDriver driver){
        this.driver=driver;
    }
    private By transferFund = By.xpath("//a[text()='Transfer Funds']");
    private By Amount= By.id("amount");
   // private By Fromaccount= By.id("fromAccountId");
   // private By toaccount= By.id("toAccountId");
    private By transferButton = By.xpath("//input[@type='submit']");
    private static By TransferComplete = By.xpath("//h1[@class='title']");
    public static By getTransferComplete() {
        return TransferComplete;}
    public TransferPage transferlink (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(transferFund).click();

     // Wait<WebDriver>wait=new WebDriverWait(driver,Duration.ofSeconds(15));

//wait.until(d -> revealed.isDisplayed());

        return this;
    }
    public TransferPage TransferFunds(String amount,String from,String to) {
        driver.findElement(Amount).sendKeys(amount);
        Select select=new Select(driver.findElement(By.id("fromAccountId")));
        select.deselectByVisibleText("15009");
        Select toAccount=new Select(driver.findElement(By.id("toAccountId")));
        toAccount.deselectByVisibleText("15009");
        //driver.findElement(Fromaccount).sendKeys(from);
        //driver.findElement(toaccount).sendKeys(to);
        return this;
}
    public PayBillPage finaltransfer(){
        driver.findElement(transferButton).click();
        return new PayBillPage(driver);
}}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoanPage {
    private WebDriver driver;

    public LoanPage (WebDriver driver){
        this.driver=driver;
    }
    private By requestLoanButton = By.xpath("//a[text()='Request Loan']");
    private By LoanAmount = By.xpath("//input[@ng-model='loanRequest.amount']");
    private By DownPayment = By.xpath("//input[@ng-model='loanRequest.downPayment']");
    private By Fromaccount  = By.xpath("//*[@id=\"fromAccountId\"]");
    private By applyButton  = By.xpath("//input[@type='submit']");
    private static By RequestProcessed  = By.xpath("//h1[@class='title']");
    public static By getRequestProcessed() {
        return RequestProcessed;}
    public  LoanPage applyLoan (){
        driver.findElement(requestLoanButton).click();
        return this;}
    public LoanPage apllyForLoan(String loanammount, String downpayment,String fromaccount) {
        driver.findElement(LoanAmount).sendKeys(loanammount);
        driver.findElement(DownPayment).sendKeys(downpayment);
        driver.findElement(Fromaccount).sendKeys(fromaccount);
        return this;
    }
    public void finalApplyButton(){
        driver.findElement(applyButton).click();

}}

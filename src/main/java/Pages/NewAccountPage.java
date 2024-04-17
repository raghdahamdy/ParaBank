package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage {
    private WebDriver driver;

    public NewAccountPage (WebDriver driver){
        this.driver=driver;
    }
    //elements

private By accountType =By.xpath("//option[@value='1']");
    private By ammount =By.xpath("//select[@id='fromAccountId']");
    private By newAccountButton =By.xpath("//input[@type='submit']");
    private static By AccountOpened = By.xpath("//h1[@class='title']");
    public static By getAccountOpened() {
       return AccountOpened;}

    //actions

        public  NewAccountPage accounttype () {
            driver.findElement(accountType).click();
            return this;
        }
    public  NewAccountPage ammountt () {
                driver.findElement(ammount).click();
        return this;
            }
    public  TransferPage newaccountbutton (){
        driver.findElement(newAccountButton).click();
        return new TransferPage(driver);
    }}


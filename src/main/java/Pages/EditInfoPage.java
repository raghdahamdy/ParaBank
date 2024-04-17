package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditInfoPage {
    private WebDriver driver;

    public EditInfoPage (WebDriver driver){
        this.driver=driver;
    }
    private By updateContact = By.xpath("//a[text()='Update Contact Info']");
    private By FisrtName= By.id("customer.firstName");
    private By LastName= By.id("customer.lastName");
    private By Address= By.id("customer.address.street");
    private By City= By.id("customer.address.city");
    private By State= By.id("customer.address.state");
    private By ZipCode= By.id("customer.address.zipCode");
    private By Phone = By.id("customer.phoneNumber");
    private By updateProfile = By.xpath("//input[@type='submit']");
    private static By ProfileUpdated = By.xpath("//h1[@class='title']");
    public static By EditInfoPage() {
        return ProfileUpdated;}
    public EditInfoPage update(String firstn,String lastN,String adres,String citty,String statte,String code, String phonee) {
        driver.findElement(updateContact).click();
        driver.findElement(FisrtName).sendKeys(firstn);
        driver.findElement(LastName).sendKeys(lastN);
        driver.findElement(Address).sendKeys(adres);
        driver.findElement(City).sendKeys(citty);
        driver.findElement(State).sendKeys(statte);
        driver.findElement(ZipCode).sendKeys(code);
        driver.findElement(Phone).sendKeys(phonee);
        return this;
    }
        public LoanPage finalUpdate(){
        driver.findElement(updateProfile).click();
            return new LoanPage(driver);
}}

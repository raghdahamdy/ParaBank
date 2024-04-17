package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;
    public RegisterPage (WebDriver driver){
        this.driver=driver;
    }
    //elements
private By FisrtRegister = By.xpath("//a[text()='Register']");
private By FisrtName= By.id("customer.firstName");
    private By LastName= By.id("customer.lastName");
    private By Address= By.id("customer.address.street");
    private By City= By.id("customer.address.city");
    private By State= By.id("customer.address.state");
    private By ZipCode= By.id("customer.address.zipCode");
    private By Phone = By.id("customer.phoneNumber");
    private By SSN= By.id("customer.ssn");
    private By Username= By.id("customer.username");
    private By Password= By.id("customer.password");
    private By Confirm= By.id("repeatedPassword");
    private By RegisterButton= By.xpath("//input[@value='Register']");
    public RegisterPage register (String firstName,String lastName,String address, String city,String state,String zipCode,
                          String phone,String ssn, String userName,String password ,String confirm) {
        driver.findElement(FisrtRegister).click();
        driver.findElement(FisrtName).sendKeys(firstName);
        driver.findElement(LastName).sendKeys(lastName);
        driver.findElement(Address).sendKeys(address);
        driver.findElement(City).sendKeys(city);
        driver.findElement(State).sendKeys(state);
        driver.findElement(ZipCode).sendKeys(zipCode);
        driver.findElement(Phone).sendKeys(phone);
        driver.findElement(SSN).sendKeys(ssn);
        driver.findElement(Username).sendKeys(userName);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(Confirm).sendKeys(confirm);
        driver.findElement(RegisterButton).click();
        return this;
        }
    }


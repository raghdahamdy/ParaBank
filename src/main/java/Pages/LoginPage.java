package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage (WebDriver driver){
        this.driver=driver;
    }
    private By usernameField = By.xpath("//input[@type='text']");
    private By passwordField = By.xpath("//input[@type='password']");
    private By loginButton = By.className("button");
    private By customerLogin = By.xpath("//input[@name='username']");
    private By customerPassword = By.xpath("//input[@name='password']");
    private By loggin = By.xpath("//input[@value='Log In']");
    private static By accountOverview = By.xpath("//h1[@class='title']");
    public static By getaccountOverview() {
        return accountOverview;}
    public LoginPage login(String username, String Password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(Password);
        driver.findElement(loginButton).click();
        return this;
    }
    public HomePage secondlogin(String customerlogin,String customerpassword){
        driver.findElement(customerLogin).sendKeys(customerlogin);
        driver.findElement(customerPassword).sendKeys(customerpassword);

        driver.findElement(loggin).click();
        return new HomePage(driver);
    }
}

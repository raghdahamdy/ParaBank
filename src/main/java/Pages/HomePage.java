package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver=driver;
    }
    private By newAccount= By.xpath("//a[text()='Open New Account']");

    public  NewAccountPage newAccount (){
        driver.findElement(newAccount).click();
        return new NewAccountPage(driver);
    }

}

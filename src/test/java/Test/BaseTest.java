package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm?fbclid=IwAR0H0cTxirabrjg5N2j1IzstWbnm78ZgOe4LxruJ6ZNp60rTHIxaROv38cM_aem_AYszmK8FC1staf69TEXHuP-dLecDziQpOsDcQUW8ryWqN-UAmffYRETGMOPWfy-gPMcxfkte8WDVIEETigRM2Eif");
    }
   @AfterMethod
   public void teardown(){
        driver.quit();
    }}




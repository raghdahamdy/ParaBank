package Test;

import Pages.RegisterPage;
import org.testng.annotations.Test;
//done
public class RegisterTest extends BaseTest{
    @Test
    public RegisterTest validLogin(){
        new RegisterPage(driver).register("loli","hossam","Helwan","Cairo","Cairo","1234",
                "01025155944","123456789","lolihossam","Lucinda@2015","Lucinda@2015");
        return this;
    }
}

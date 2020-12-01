package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Extend.ExtendBasePage;
import Extend.HomePage;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void test_invalid_account() {
		
		HomePage h=new HomePage(driver);
		h.gotohomeURL()
		 .clickToLogin()
		 .loginOperate("11", "11");
		
		
	}

}

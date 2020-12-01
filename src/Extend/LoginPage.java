package Extend;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage extends ExtendBasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 WebDriver driver;
	 By nameinput=By.id("email");
	 By passwordinput=By.id("password");
	 By submit=By.xpath("//div/button[contains(text(),'登录')]");
	 
	 
	 public LoginPage loginOperate(String usrname,String password) {
		 sendElement(nameinput,usrname);
		 sendElement(passwordinput,password);
		 clickOperate(submit);
		 return this;
	 }

	

}

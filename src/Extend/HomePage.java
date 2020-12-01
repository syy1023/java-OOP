package Extend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends ExtendBasePage{
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	WebDriver driver=new ChromeDriver();
	String HomeURL="http://www.guanggoo.com/";
	By ClickButton=By.xpath("//li/a[contains(text(),'登录')]");
	
	
	public HomePage gotohomeURL() {
		driver.get(HomeURL);
		return this;
		
	}
	
	public LoginPage clickToLogin() {
		driver.findElement(ClickButton).click();
		return new LoginPage(driver);
	}
	
	

}

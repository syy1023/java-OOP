package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	String path="/usr/local/bin/chromedriver";
	
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", path);
		driver=new ChromeDriver();
		//driver.get("http://www.guanggoo.com/");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
		
	}

}

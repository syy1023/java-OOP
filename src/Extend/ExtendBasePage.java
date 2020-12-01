package Extend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.By;


public class ExtendBasePage {
	WebDriver driver;
	WebDriverWait wait;
	String text;
	String expecText;
	
	public ExtendBasePage(WebDriver driver) {
		this.driver=driver;
		wait= new WebDriverWait(driver,20);
	}
	
	public void findOperate(By elementBy) {
		driver.findElement(elementBy);
		
	}
	
	public void clickOperate(By elementBy) {
		driver.findElement(elementBy).click();
		
	}
	
	public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));

    }
	
	public void sendElement(By elementBy,String text) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).sendKeys(text);
	}
	
	public String readTitle(By elementBy) {
		return driver.getTitle();
		
	}
	
	public void assertEquals(By elementBy,String expectedText){
        waitVisibility(elementBy);
        Assert.assertEquals(readTitle(elementBy),expectedText);
    }

}

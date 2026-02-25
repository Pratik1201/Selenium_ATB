package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task1 {
	
	@Test
	public void curaDemo() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		WebElement mAButton = driver.findElement(By.id("btn-make-appointment"));
		mAButton.click();
		
		WebElement userName = driver.findElement(By.id("txt-username"));
		userName.sendKeys("John Doe");
		
		WebElement passWord = driver.findElement(By.id("txt-password"));
		passWord.sendKeys("ThisIsNotAPassword");
		
		WebElement loginButton = driver.findElement(By.id("btn-login"));
		loginButton.click();
		
		Thread.sleep(4000);
		
		Assert.assertEquals("https://katalon-demo-cura.herokuapp.com/#appointment", driver.getCurrentUrl());
		
		WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'Make Appointment')]"));
		Assert.assertEquals("Make Appointment", title.getText());
		
		driver.quit();
		
	}
	

}

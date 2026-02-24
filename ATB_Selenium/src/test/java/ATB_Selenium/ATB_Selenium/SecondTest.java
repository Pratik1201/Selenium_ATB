package ATB_Selenium.ATB_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test
	public void secTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='has-text-align-center']")).getText());
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("practicetestautomation.com/logged-in-successfully/"),"URL does not contain expected path. Actual URL:" + currentURL);
		WebElement text = driver.findElement(By.xpath("//h1[@class='post-title']"));
		String textMessage = text.getText();
		Assert.assertTrue(textMessage.contains("Logged In Successfully") , "Actual Text:" + textMessage);
		WebElement logoutBtn = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
		Assert.assertTrue(logoutBtn.isDisplayed());
		driver.quit();
		
		
		
		
	}

}

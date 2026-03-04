package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task4_Waits {
	@Test
	public void expWait() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.vwo.com/#/login");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement email = driver.findElement(By.cssSelector("#login-username"));
		email.sendKeys("admin@admin.com");
		
		WebElement password = driver.findElement(By.cssSelector("#login-password"));
		password.sendKeys("admin");
		
		WebElement signInBtn = driver.findElement(By.id("js-login-btn"));
		signInBtn.click();
		
		
		WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#js-notification-box-msg")));
		String actualResult = errorMsg.getText();
		
		String expectedResult = "Your email, password, IP address or location did not match";
		
		Assert.assertEquals(actualResult, expectedResult);
		
		driver.quit();
		
		
		

	}
}

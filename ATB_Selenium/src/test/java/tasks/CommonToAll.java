package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonToAll {
	
	public WebDriver driver;
	public void openBrowser(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	
	public void waitForVisibility(WebDriver driver, int timeinSeconds, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeinSeconds));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

}

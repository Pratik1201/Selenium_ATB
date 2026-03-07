package ATB_Selenium.ATB_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import tasks.CommonToAll;

public class SVG extends CommonToAll{
	WebDriver driver;
	@Test
	public void test_Flipkart_SVG() {
		driver = new ChromeDriver();
		openBrowser(driver, "https://www.flipkart.com/search");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("b3wTlE"))).click();
		
		WebElement searchInput = driver.findElement(By.name("q"));
		searchInput.sendKeys("macmini");
		
		List<WebElement> searchSVG = driver.findElements(By.xpath("//*[local-name()='svg']"));
		searchSVG.get(0).click();
	}
	

}

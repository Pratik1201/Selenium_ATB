package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class task5_Booking extends CommonToAll {

	@Test
	public void bookingFlight() {
		WebDriver driver = new ChromeDriver();
		openBrowser(driver, "https://www.booking.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));

		WebElement closeBtn = driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']"));
		closeBtn.click();

		WebElement flight = driver.findElement(By.id("flights"));
		flight.click();

		WebElement dest = driver.findElement(By.xpath("//span[contains(text(),'Going to')]"));

		Actions action = new Actions(driver);
		action.moveToElement(dest).click().sendKeys("DEL").sendKeys(Keys.TAB, Keys.ENTER).perform();

		WebElement search = driver.findElement(By.xpath("//button[@data-ui-name='button_search_submit']"));
		search.click();

	}

}

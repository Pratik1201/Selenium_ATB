package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task3_WebTable {
	@Test
	public void test_webTable() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
	Thread.sleep(4000);
	
	WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	userName.sendKeys("admin");
	
	WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
	passWord.sendKeys("Hacker@4321");
	
	WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	loginBtn.click();
	
	Thread.sleep(4000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	
	WebElement tEmployee = driver.findElement(By.xpath("//div[@role='rowgroup']/div[@class='oxd-table-card'][2]"));
	System.out.print(tEmployee.getText());
	
	WebElement deleteBtn = driver.findElement(By.xpath("(//i[@class='oxd-icon bi-trash'])[2]"));
	deleteBtn.click();
	
	driver.quit();
	
	
	

}
}

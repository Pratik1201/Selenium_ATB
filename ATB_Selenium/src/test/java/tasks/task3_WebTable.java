package tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task3_WebTable {
	@Test
	public void test_webTable() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
	

}
}

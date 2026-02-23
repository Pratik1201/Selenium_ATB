package ATB_Selenium.ATB_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
	
	@Test
	public void secTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login");
		driver.manage().window().maximize();
		
		
	}

}

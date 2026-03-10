package ATB_Selenium.ATB_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuutomationPractice {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awesomeqa.com/practice.html");
		System.out.println(driver.getTitle());
	}

}

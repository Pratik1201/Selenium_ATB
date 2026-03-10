package ATB_Selenium.ATB_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuutomationPractice {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awesomeqa.com/practice.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sumit");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patel");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-2")).click();
		driver.findElement(By.id("datepicker")).sendKeys("12/01/1994");
	}

}

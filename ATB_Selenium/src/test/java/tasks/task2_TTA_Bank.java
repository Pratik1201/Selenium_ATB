package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task2_TTA_Bank {
	
	@Test
	public static void TTA() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
		
		WebElement signUp = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
		signUp.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@type='text']"));
		firstName.sendKeys("Sumit Patel");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("spatel@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Qwerty@123");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();
		
		Thread.sleep(4000);
		
		WebElement transferFunds = driver.findElement(By.xpath("//button[normalize-space()='Transfer Funds']"));
		transferFunds.click();
		
		WebElement amount = driver.findElement(By.xpath("//input[@type='number']"));
		amount.sendKeys("5000");
		
		WebElement note = driver.findElement(By.xpath("//input[@type='text']"));
		note.sendKeys("Rent for room");
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		
		
		WebElement transfer = driver.findElement(By.xpath("//button[normalize-space()='Confirm Transfer']"));
		transfer.click();
		
		WebElement dashboard = driver.findElement(By.xpath("//button[normalize-space()='Dashboard']"));
		dashboard.click();
		
		WebElement Text = driver.findElement(By.xpath("//p[@class='text-blue-100 text-sm font-medium']"));
		Assert.assertEquals("Total Balance", Text.getText());
		
		System.out.println(driver.findElement(By.xpath("//div[@class='rounded-xl bg-gradient-to-br from-blue-600 to-blue-800 p-6 text-white shadow-lg']//div[@class='flex items-center justify-between']")).getText());
		
	}

}

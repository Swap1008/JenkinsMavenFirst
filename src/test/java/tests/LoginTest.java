package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	public void Test1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void clickonLogin() {
		driver.findElement(By.xpath("//a[text()='Login & Signup']")).click();
	}
	
	@Test(priority = 2)
	public void enterEmail() {
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("abc@gmail.com");
	}
	@AfterClass
	public void endSetup() {
		driver.close();
	}
}

package com.icinbank;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;


public class AddRecipient {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\rs\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://localhost:8080/index");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.name("username")).sendKeys("test123");
		 driver.findElement(By.name("password")).sendKeys("test123");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(3000);
		 
	}
	
	
	@Test(priority = 11)
	public void addRecipient() throws InterruptedException {
		driver.findElement(By.id("transfer")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addrecipient")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("recipientName")).sendKeys("Test Recipient");
		driver.findElement(By.id("recipientEmail")).sendKeys("testrecipient@gmail.com");
		driver.findElement(By.id("recipientPhone")).sendKeys("9897654321");
		driver.findElement(By.id("recipientAccountNumber")).sendKeys("11223148");
		driver.findElement(By.id("recipientDescription")).sendKeys("test description");
		Thread.sleep(3000);
		driver.findElement(By.id("recipientsubmit")).click();
		Thread.sleep(6000);
		System.out.println("add recipient.....successful");
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}

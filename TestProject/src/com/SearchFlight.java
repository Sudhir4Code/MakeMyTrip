package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchFlight {
	WebDriver driver;
	@BeforeTest
	public void init() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void Search(){
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		sendKeys("Kolkata");
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Mumbai");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}

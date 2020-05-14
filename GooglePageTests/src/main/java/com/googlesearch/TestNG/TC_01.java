package com.googlesearch.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_01 {

	WebDriver driver;

	@BeforeMethod
	public void setUp() 
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void googleTest()
	{
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Audi", Keys.ENTER);
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}

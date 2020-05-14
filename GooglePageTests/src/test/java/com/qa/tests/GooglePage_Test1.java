package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage_Test1 {
	public static WebDriver driver;

	public static void main(String[] args) {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe"); // generic
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("facebook", Keys.ENTER);
	}
}

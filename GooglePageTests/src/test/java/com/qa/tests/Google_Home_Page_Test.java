package com.qa.tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.pages.Google_Page;

public class Google_Home_Page_Test {
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path + "\\Drivers\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Google_Page.textbox_Search(driver).sendKeys("facebook", Keys.ENTER);
		driver.quit();
	}
}

package com.qa.tests2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pages.Google_Page_Objects;

public class Google_Page_Objects_Test extends Google_Page_Objects {

	static WebDriver driver = null;
	Google_Page_Objects obj;

	public Google_Page_Objects_Test(WebDriver driver) {
		super(driver);
	}

	@BeforeTest
	public void setUp() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		obj =new Google_Page_Objects(driver);
	}

	@Test
	public void googlePageTest() {
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		obj.enterText("gmail");
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}

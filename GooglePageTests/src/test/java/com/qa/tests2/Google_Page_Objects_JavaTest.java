package com.qa.tests2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.Google_Page_Objects;

public class Google_Page_Objects_JavaTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		Google_Page_Objects obj = new Google_Page_Objects(driver);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		obj.enterText("facebook");
		// obj.clickSearchButton();

		driver.close();
	}

}

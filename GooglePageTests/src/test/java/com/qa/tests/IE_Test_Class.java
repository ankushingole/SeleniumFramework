package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IE_Test_Class {
	public static WebDriver driver = null;

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", path + "\\Drivers\\IEDriverServer.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings", true);
		driver = new InternetExplorerDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.close();
	}
}

package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google_Page_Objects {

	 public WebDriver driver;

	public Google_Page_Objects(WebDriver driver) {
		this.driver = driver;
	}

	// Page Objects
	By textBoxLocator = By.name("q");
	By buttonLocator = By.name("btnk");

	// Actions
	public void enterText(String text) {
		driver.findElement(textBoxLocator).sendKeys(text, Keys.ENTER);
	}

	public void clickSearchButton() {
		driver.findElement(buttonLocator).sendKeys(Keys.ENTER);
	}

}

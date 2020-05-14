package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_Page {
//	public WebDriver driver;

	public static WebElement textbox_Search(WebDriver driver) {

		WebElement searchBox = driver.findElement(By.name("q"));
		return searchBox;
	}

	public static WebElement search_Btn(WebDriver driver) {
		WebElement searchBtn = driver.findElement(By.name("btnK"));
		return searchBtn;
	}
}




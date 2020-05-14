package com.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRMLoginLogout {

	public static void main(String[] args) throws Exception {
		WebDriver driver;

		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		String loginURL = driver.getCurrentUrl();
		if (loginURL.contains("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {

			System.out.println("Login Successful");
		}

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),\"Welcome Admin\")]")).click();

		Actions act = new Actions(driver);
		act.build().perform();
		WebElement logout = driver.findElement(By.xpath("//a[contains(text(),\"Logout\")]"));
		logout.click();

		String logoutURL = driver.getCurrentUrl();
		if (logoutURL.contains("https://opensource-demo.orangehrmlive.com/index.php/auth/login")) {

			System.out.println("Logout Successful");
		}
		driver.quit();

	}

}

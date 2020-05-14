package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLinkExistanceinHomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		try {
			//if (driver.findElement(By.linkText("Gmail")).isDisplayed())
				if(driver.findElement(By.xpath("//a[contains(text()='Gmail')]")).isDisplayed())
			{
				System.out.println("Gmail link exist--PASSED");
			}

		} catch (NoSuchElementException e) {
			System.out.println("Gmail link not exist---Failed");
		}
		System.out.println(driver.getCurrentUrl());

		//driver.close();
	}
}

package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGmailLinkExistance {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		try {
			Boolean linkStatus = driver.findElement(By.linkText("Gmail")).isDisplayed();
			if (linkStatus == true) {
			System.out.println("Gmail link is present---Passed");
			}
		} 
		catch (NoSuchElementException e) {
			System.out.println("Gmail link is not present--Failed");
		}
		driver.close();
	}
}

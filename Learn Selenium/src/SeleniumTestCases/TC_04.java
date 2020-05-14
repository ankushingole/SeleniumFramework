package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_04 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:www.google.co.in");
		try {
			boolean linkPresent = driver.findElement(By.linkText("akola")).isDisplayed();

			if (linkPresent) {

				System.out.println("Gmail link exist---Passed");
			}
		} catch (NoSuchElementException e) {

			System.out.println("Link not exist---failed");
		}
		driver.close();
	}

}

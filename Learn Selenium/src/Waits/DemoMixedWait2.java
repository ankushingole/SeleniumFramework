package Waits;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoMixedWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// setting implicit time
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Loading a URL
		driver.get("https://www.redbus.in/");

		// defining explicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Loading a URL
		driver.get("https://www.redbus.in/");

		// defining explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		// Locating and typing in From text box.

		System.out.println("Wait starts:" + new Date());
		
			WebElement fromTextBox = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Wrong Locator"))));
		
		
		System.out.println("Wait ends:" + new Date());

		driver.quit();

	}

}

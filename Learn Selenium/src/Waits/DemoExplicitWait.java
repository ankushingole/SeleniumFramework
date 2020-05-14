package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait
				.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//p[text()='WebDriver']"))));

		if (ele.isDisplayed()) {

			System.out.println("element is displayed");
		} else {

			System.out.println("element is not displayed");
		}
		driver.quit();
	}

}

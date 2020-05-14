package ChromeDriver_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNavigate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		driver.navigate().to("https://www.amazon.in/");

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.navigate().back();

		driver.close();

	}

}

package cssSelectors;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangrehrmLogin {
	WebDriver driver;

	@BeforeMethod
	public void getBrowser() {

		//System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM SOFT\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@Test
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#btnLogin")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}

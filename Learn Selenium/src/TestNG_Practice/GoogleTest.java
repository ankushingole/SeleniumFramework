package TestNG_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;

	@BeforeMethod
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Workspace\\LearnSelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test(priority = 1)
	public void googleTitleTest() 
	{
		String actual=driver.getTitle();
		String expected="Google";
		Assert.assertEquals(actual, expected);
		System.out.println("Test Case 1 Passed");
	}

	@Test(priority = 2)
	public void googleLogoTest()
	{
		Boolean logo = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(logo);
		System.out.println("Test Case 2 Passed");
	}
}

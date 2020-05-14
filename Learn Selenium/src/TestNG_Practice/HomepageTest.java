package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTest {
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Opened");
	}

	@AfterMethod
	public void closeBrowser() {

		driver.quit();
		System.out.println("Browser Closed");
	}

	@Test(priority = 1)
	public void verifyFacebook() {
		System.out.println("Facebook");
		driver.get("https://www.facebook.com/");
		String actual = driver.getTitle();
		String expected = "Facebook – log in or sign up";
		Assert.assertEquals(actual, expected);
		System.out.println("Test Case 1 passed");
	}

	@Test(priority = 2)
	public void verifyOrangeHRM() {
		System.out.println("OrangeHRM");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String actual = driver.getTitle();
		String expected = "OrangeHRM";
		Assert.assertEquals(actual, expected);
		System.out.println("Test Case 2 passed");
	}

	@Test(priority = 3)
	public void verifySBI() {
		System.out.println("SBI");
		driver.get("https://www.onlinesbi.com/");
		String actual = driver.getTitle();
		String expected = "State Bank of India";
		Assert.assertEquals(actual, expected);
		System.out.println("Test Case 3 passed");
	}

}

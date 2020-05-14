package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_11_VerifyTitles {
	public WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		driver = new FirefoxDriver();
		System.out.println("Browser launched");
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser closed");
	}

	@Test(priority = 3)
	public void verifyGmail() {
		driver.get("https://www.gmail.com");
		Assert.assertEquals("Gmail - Free Storage and Email from Google", driver.getTitle());
		System.out.println("Gmail page");
	}

	@Test(priority = 2)
	public void verifyGoogle() {
		driver.get("https://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
		System.out.println("Google page");
	}

	@Test(priority = 4)
	public void verifyFacebook() {
		driver.get("https://www.facebook.com");
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		System.out.println("Facebook page");
	}

}

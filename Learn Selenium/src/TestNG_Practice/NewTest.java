package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@Test(priority = 1)
	public void verifyGoogleTitle() throws Exception {
		driver.get("https://www.google.com");
		// Thread.sleep(2000);
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "Google");

	}

	@Test(priority = 3)
	public void verifyYahooTitle() throws Exception {
		driver.get("https://in.yahoo.com/");
		// Thread.sleep(2000);
		String yahooTitle = driver.getTitle();
		Assert.assertEquals(yahooTitle, "Yahoo India");

	}

	@Test(priority = 2)
	public void verifyGcritTitle() throws Exception {
		driver.get("http://www.gcrit.com/build3/");
		// Thread.sleep(2000);
		String gcrTitle = driver.getTitle();
		Assert.assertEquals(gcrTitle, "GCR Shop");

	}

}

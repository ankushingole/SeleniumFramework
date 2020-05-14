package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseofDependsOn {
	WebDriver driver;

	@Test(priority = 2)
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Workspace\\LearnSelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = "verifyYahooTitle", alwaysRun = true)
	public void closeBrowser() {
		driver.close();
	}

	@Test(priority = 1, dependsOnMethods = "launchBrowser")
	public void GoogleTitle() throws Exception {
		driver.get("https://www.google.com");
		// Thread.sleep(2000);
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "Google");

	}

	@Test(dependsOnMethods = "GoogleTitle")
	public void verifyYahooTitle() throws Exception {
		driver.get("https://in.yahoo.com/");
		// Thread.sleep(2000);
		String yahooTitle = driver.getTitle();
		Assert.assertEquals(yahooTitle, "Yahoo India");

	}

}

package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest4 {
	WebDriver driver;

	@Test(groups = { "sanity", "regression" }, priority = 1)
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Workspace\\LearnSelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(groups = { "sanity", "regression" }, priority = 7)
	public void closeBrowser() {
		driver.close();
	}

	@Test(groups = { "sanity" }, priority = 6)
	public void verifyGoogleTitle() throws Exception {
		driver.get("https://www.google.com");
		// Thread.sleep(2000);
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "Google");

	}

	@Test(groups = { "sanity", "regression" }, priority = 2)
	public void verifyGcritTitle() throws Exception {
		driver.get("http://www.gcrit.com/build3/");
		// Thread.sleep(2000);
		String gcrTitle = driver.getTitle();
		Assert.assertEquals(gcrTitle, "GCR Shop");

	}

	@Test(groups = { "regression" }, priority = 3)
	public void verifyMercedesTitle() throws Exception {
		driver.get("https://www.mercedes-benz.co.in/passengercars.html");
		// Thread.sleep(2000);
		String yahooTitle = driver.getTitle();
		Assert.assertEquals(yahooTitle, "Mercedes-Benz passenger cars");

	}

	@Test(groups = { "sanity" }, priority = 4)
	public void verifySkodaTitle() throws Exception {
		driver.get("https://www.skoda-auto.co.in/");
		// Thread.sleep(2000);
		String gcrTitle = driver.getTitle();
		System.out.println(gcrTitle);
		Assert.assertEquals(gcrTitle, "HOMEPAGE");

	}

	@Test(groups = { "sanity" }, priority = 5)
	public void verifyAudiTitle() throws Exception {
		driver.get("https://www.audi.in/in/web/en.html");
		// Thread.sleep(2000);
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "Audi India");

	}
}

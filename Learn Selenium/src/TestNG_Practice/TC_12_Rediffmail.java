package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_12_Rediffmail {
	public static WebDriver driver;

	@BeforeMethod
	public void getbrowser() {
		driver = new FirefoxDriver();
		System.out.println("Browser launched");
	}

	@Test
	public void verifyRediff() {
		driver.get("https://www.rediff.com/");
		Assert.assertEquals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping", driver.getTitle());
		System.out.println("Rediff executed");
	}

	@Test
	public void verifySbi() {
		driver.get("https://www.onlinesbi.com/");
		Assert.assertEquals("State Bank of India", driver.getTitle());
		System.out.println("SBI executed");
	}

	@Test
	public void verifyBankofIndia() {
		driver.get("https://www.bankofindia.co.in//");
		Assert.assertEquals("BOI | Bank of India", driver.getTitle());
		System.out.println("BOI executed");
	}

	@Test
	public void verifyIcici() {
		driver.get("https://www.icicibank.com/");
		Assert.assertEquals("Personal Banking, Online Banking Services - ICICI Bank", driver.getTitle());
		System.out.println("ICICI executed");
	}  

	@AfterMethod
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser closed");
	}

}

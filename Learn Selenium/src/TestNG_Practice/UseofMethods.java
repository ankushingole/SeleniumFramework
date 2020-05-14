package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseofMethods {

	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch browser");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("close browser");
		driver.close();
	}

	@Test(priority = 1)
	public void verifyFacebook() {
		System.out.println("Facebook");
		driver.get("https://www.facebook.com/");
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Facebook – log in or sign up");
	}

	@Test(priority = 2)
	public void verifyOrangeHRM() {
		System.out.println("OrangeHRM");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "OrangeHRM");
	}

	@Test(priority = 3)
	public void verifySBI() {
		System.out.println("SBI");
		driver.get("https://www.onlinesbi.com/");
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "State Bank of India");
	}

}

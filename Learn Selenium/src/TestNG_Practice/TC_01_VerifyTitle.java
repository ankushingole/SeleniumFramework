package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_VerifyTitle {
	static WebDriver driver;

	@Test
	public void verifyTitle() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");

		String title = driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
		driver.close();
	}
}

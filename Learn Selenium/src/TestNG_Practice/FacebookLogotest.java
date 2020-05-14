package TestNG_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLogotest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void verifyLogo() {
		boolean b = driver.findElement(By.xpath("//i[@class='fb_logo img sp_XWJdzZnoeA1 sx_ba923f']")).isDisplayed();
	}

	@Test
	public void verifyTitle() {
		String title = driver.getTitle();
		System.out.println("The title of page is: " + title);
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void test() {

		String a = "100X";
		Integer.parseInt(a);

		System.out.println();
	}
}

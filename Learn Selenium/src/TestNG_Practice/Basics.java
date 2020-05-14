package TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {
	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system property");
	}
	
	@BeforeTest
	public void login() {

		System.out.println("Login to application");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch browser");
	}

	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}

	@Test
	public void getPageTitle() {

		System.out.println("Get page title");
	}

	@AfterMethod
	public void logOut() {

		System.out.println("Logout from Application");

	}
	
	@AfterClass
	public void closeBrowser() {

		System.out.println("Browser closed");

	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete all cookies");

	}

	
	@AfterSuite
	public void generateReport() {

		System.out.println("Report generated");
	}

}

package TestNG_Practice;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	//// Preconditions annotations
	@BeforeSuite
	public void setUp() {

		System.out.println("setup system property for chrome");

	}

	@BeforeTest
	public void login() {

		System.out.println("Logged in");
	}

	@BeforeClass
	public void openBrowser() {

		System.out.println("Launch chrome browser");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}

	/// test cases annotations
	@Test
	public void googleTitleTest() {

		System.out.println("Google title test");

	}

	/// Post conditions annotations
	@AfterMethod
	public void logout() {

		System.out.println("logged out");
	}

	@AfterClass
	public void closeBrowser() {

		System.out.println("Close the browser");
	}

	@AfterTest
	public void deleteAllCookies() {

		System.out.println("delete all cookies");
	}

	@AfterSuite
	public void getTestReport() {
		System.out.println("Get test report");
	}

}

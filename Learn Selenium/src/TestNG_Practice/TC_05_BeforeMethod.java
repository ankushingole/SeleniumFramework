package TestNG_Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_05_BeforeMethod {

	@BeforeMethod
	public void login() {
		System.out.println("Login to application");
	}

	@Test
	public void click() {
		System.out.println("Click on logo");
	}

	@Test
	public void select() { 
		System.out.println("Select the title");
	}

	@AfterMethod
	public void logout() {
		System.out.println("Logout from application");
	}
}

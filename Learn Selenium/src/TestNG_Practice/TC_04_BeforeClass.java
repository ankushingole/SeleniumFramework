package TestNG_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_04_BeforeClass {

	@BeforeClass
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

	@AfterClass
	public void logout() {
		System.out.println("Logout from application");
	}
}

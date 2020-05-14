package TestNG_Practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_06_BeforeTest {

	@BeforeTest
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

	@AfterTest
	public void logout() {
		System.out.println("Logout from application");
	}

}

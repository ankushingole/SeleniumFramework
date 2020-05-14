package TestNG_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_07 {

	@BeforeClass
	public void login() {
		System.out.println("login successful");
	}

	@AfterClass
	public void logout() {
		System.out.println("logout successful");
	}

	@Test(priority = 1)
	public void searchItem() {
		System.out.println("Search successful");
	}

	@Test(priority = 2)
	public void selectItem() {
		System.out.println("Item Selected successful");
	}

	@Test(priority = 3)
	public void makePayment() {
		System.out.println("Payment successful");
	}
}

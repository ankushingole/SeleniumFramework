package TestNG_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_08 {

	@BeforeClass
	public void login() {
		System.out.println("Login");
	}

	@AfterClass
	public void logout() {
		System.out.println("Logout");
	}

	@Test(priority = 3)
	public void remove() {
		System.out.println("Remove");
	}

	@Test(priority = 1)
	public void search() {
		System.out.println("Search Item");
	}

	@Test(priority = 2)
	public void wishlist() {
		System.out.println("Wishlisted");
	}

}

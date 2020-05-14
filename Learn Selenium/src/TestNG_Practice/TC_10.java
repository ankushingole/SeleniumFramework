package TestNG_Practice;

import org.testng.annotations.Test;

public class TC_10 {
	@Test(groups = { "Sanity", "Regression" }, priority = 1)
	public void login() {
		System.out.println("login done!");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 10)
	public void logout() {
		System.out.println("logout done!");
	}

	@Test(groups = { "Sanity" }, priority = 2)
	public void search() {
		System.out.println("Search successful");
	}

	@Test(groups = { "Regression" }, priority = 3)	
	public void advancedSearch() {
		System.out.println("Advanced search successful");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 4)
	public void prepaidRecharge() {
		System.out.println("Recharge successful");
	}

}

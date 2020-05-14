package TestNG_Practice;

import org.testng.annotations.Test;

public class UseOfGroups {

	@Test(priority = 1, groups = { "sanity", "regression" })
	public void login() {

		System.out.println("Login");
	}

	@Test(groups = { "sanity", "regression" }, priority = 5)
	public void logout() {

		System.out.println("LogOut");
	}

	@Test(groups = { "regression" }, priority = 2)
	public void search() {

		System.out.println("Search");
	}

	@Test(groups = { "sanity" }, priority = 3)
	public void advancedSearch() {

		System.out.println("AdvancedSearch");
	}

	@Test(groups = { "sanity", "regression" }, priority = 4)
	public void select() {

		System.out.println("Select");
	}

}

package TestNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_03_MutipleTestCases2 {
	
	@Test(dependsOnMethods={"login"})
	public void run() {
		Assert.assertEquals("Sonu", "Sonu");
	}

	@Test
	public void login() {
		Assert.assertEquals("Google", "Google");
	}

	@Test(dependsOnMethods={"run"})
	public void logout() {
		Assert.assertEquals("Gmail", "Gmail");
	}

}

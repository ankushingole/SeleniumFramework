package TestNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_02_MutipleTestCases {
	
	@Test(priority=2)
	public void run() {
		Assert.assertEquals("Sonu", "Sonu");
	}

	@Test(priority=1)
	public void login() {
		Assert.assertEquals("Google", "Google");
	}

	@Test(priority=3)
	public void logout() {
		Assert.assertEquals("Gmail", "Gmail");
	}

}

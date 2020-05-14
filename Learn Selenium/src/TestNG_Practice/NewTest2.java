package TestNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 extends Parent {

	
	@Test(priority = 1)
	public void verifyGoogleTitle() throws Exception {
		driver.get("https://www.google.com");
		// Thread.sleep(2000);
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "Google");

	}

	@Test(priority = 3)
	public void verifyYahooTitle() throws Exception {
		driver.get("https://in.yahoo.com/");
		// Thread.sleep(2000);
		String yahooTitle = driver.getTitle();
		Assert.assertEquals(yahooTitle, "Yahoo India");

	}

	@Test(priority = 2)
	public void verifyGcritTitle() throws Exception {
		driver.get("http://www.gcrit.com/build3/");
		// Thread.sleep(2000);
		String gcrTitle = driver.getTitle();
		Assert.assertEquals(gcrTitle, "GCR Shop");

	}

}

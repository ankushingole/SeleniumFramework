package TestNG_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest3 extends Parent {

	@Test(priority = 4)
	public void verifyAudiTitle() throws Exception {
		driver.get("https://www.audi.in/in/web/en.html");
		// Thread.sleep(2000);
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "Audi India");

	}

	@Test(priority = 5)
	public void verifyMercedesTitle() throws Exception {
		driver.get("https://www.mercedes-benz.co.in/passengercars.html");
		// Thread.sleep(2000);
		String yahooTitle = driver.getTitle();
		Assert.assertEquals(yahooTitle, "Mercedes-Benz passenger cars");

	}

	@Test(priority = 6)
	public void verifySkodaTitle() throws Exception {
		driver.get("https://www.skoda-auto.co.in/");
		// Thread.sleep(2000);
		String gcrTitle = driver.getTitle();
		Assert.assertEquals(gcrTitle, "Homepage");

	}

}

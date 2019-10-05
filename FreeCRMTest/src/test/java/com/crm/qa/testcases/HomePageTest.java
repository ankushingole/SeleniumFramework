package com.crm.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	DealsPage dealsPage;

	public HomePageTest() throws Exception {
		super();
	}

	// Test cases should be independent of each other
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void verifyHomePageTitleTest() throws InterruptedException {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRM", "HomePage title not matched");
	}

	@Test(priority = 2)
	public void verifyUser() throws InterruptedException {
		Assert.assertTrue(homePage.verifyUser());
	}

	@Test(priority = 3)
	public void verifyContactsLink() throws IOException {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		contactsPage = homePage.clickOnContactsLink();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']")).isDisplayed());
	}

	@Test(priority = 4)
	public void verifyDealsPageLink() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		dealsPage = homePage.clickOnDealsLink();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']")).isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}

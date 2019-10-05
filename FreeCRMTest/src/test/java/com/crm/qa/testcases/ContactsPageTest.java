package com.crm.qa.testcases;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	TestUtil testUtil;
	ContactsPage contactsPage;

	public ContactsPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage = homePage.clickOnContactsLink();

	}

	@Test(priority = 1)
	public void verifyContactsLabel() {
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "Not displayed");
	}

	@Test(priority = 2)
	public void verifySelectContact() {

		try {
			contactsPage.selectContactName("Sagar S Patil");
		} catch (NoSuchElementException e) {
			e.getMessage();
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}

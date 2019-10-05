package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		System.out.println("Test case 1 successful");
	}

	@Test(priority = 2)
	public void loginTest() throws InterruptedException, IOException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		boolean img = driver.findElement(By.xpath("//span[@class='user-display']")).isDisplayed();
		Assert.assertTrue(img);
		System.out.println("Test case 2 successful");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}

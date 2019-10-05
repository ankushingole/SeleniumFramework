package com.crm.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Ankush Ingole')]")
	WebElement user;

	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;

	public HomePage() throws IOException {

		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyUser() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		return user.isDisplayed();
	}

	public ContactsPage clickOnContactsLink() throws IOException {
		{
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			contactsLink.click();
			return new ContactsPage();
		}
	} 
	
	

	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
}

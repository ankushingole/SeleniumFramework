package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//div[text()='Contacts']")
	WebElement contactsLabel;

	public ContactsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyContactsLabel() {
		return contactsLabel.isDisplayed();
	}

	public void selectContactName(String name) {

		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//td[text()='" + name + "']//preceding-sibling::td//div[@class='ui fitted read-only checkbox']"))
				.click();
	}

}

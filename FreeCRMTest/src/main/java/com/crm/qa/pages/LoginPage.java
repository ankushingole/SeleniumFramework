package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page factory - OR
	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;

	// Initialize page objects
	public LoginPage() throws Exception{
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	// login action
	public HomePage login(String un, String ps) throws IOException {
		email.sendKeys(un);
		password.sendKeys(ps);
		loginBtn.click();
		return new HomePage();
	}

}

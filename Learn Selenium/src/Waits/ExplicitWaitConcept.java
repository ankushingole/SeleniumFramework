package Waits;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));

		sendKeys(driver, firstName, 10, "Ankush");
		sendKeys(driver, lastName, 5, "Ingole");
		sendKeys(driver, email, 5, "ankushingole007@gmail.com");
		sendKeys(driver, password, 5, "ankush123");

		WebElement forgotPassword = driver.findElement(By.linkText("Forgotten account?"));
		clickOn(driver, forgotPassword, 20);

		driver.close();

	}

	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void clickOn(WebDriver driver, WebElement element, int timeout) {

		new WebDriverWait(driver, timeout).ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.elementToBeClickable(element));

		element.click();

	}

}

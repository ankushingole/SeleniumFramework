package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class TC_04_FluentWait2 {

	public static void main(String[] args) throws Exception {

		// System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM
		// SOFT\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://uitestpractice.com/Students/contact");
		WebElement link = driver.findElement(By.xpath("//a[(text()='This is a Ajax link')]"));
		link.click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='ContactUs']/p")));

		WebElement s1 = driver.findElement(By.xpath("//div[@class='ContactUs']/p"));
		s1.getText();

	}
}

package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class TC_03_FluentWait {

	public static void main(String[] args) throws Exception {

		// System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM
		// SOFT\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("abcd" + Keys.RETURN);
		// driver.findElement(By.linkText("ABCD - NIMH Data Archive -
		// NIH")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(30, TimeUnit.SECONDS)

				.pollingEvery(2, TimeUnit.SECONDS)

				.ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'ABCD - NIMH Data Archive - NIH')] "));
				
				if (ele.isEnabled()) {
					System.out.println("Element is found");
				}
				return ele;
			}
		});
		
		Thread.sleep(3000);
		element.click();
		driver.close();
		driver.quit();

	}

}

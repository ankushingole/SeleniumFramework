package Waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class DemoFluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement ele = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver)

			{
				WebElement ele1 = driver.findElement(By.xpath(".//*[@id='demo']"));

				String value = ele1.getAttribute("innerHTML");

				if (value.equalsIgnoreCase("WebDriver")) {
					return ele1;
				} else {
					System.out.println("text coming on screeen: " + value);
					return null;
				}
			}
		});

		System.out.println("Element is Displayed: " + ele.isDisplayed());
		driver.quit();
	}

}

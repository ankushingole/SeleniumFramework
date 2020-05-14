package HandlingChatBot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Script01_CRMPRO {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		{

			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			// driver.get("https://ksrtc.in/oprs-web/");
			driver.get("https://www.irctc.co.in/nget/train-search");
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[@id='corover-cb-widget']"))).click().build().perform();
			driver.findElement(By.id("corover-close-btn")).click();
		}

	}

}

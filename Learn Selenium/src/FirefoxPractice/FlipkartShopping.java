package FirefoxPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartShopping {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.className("vh79eN")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 7 (Black, 32 GB)')]")).click();

		Set<String> Windows = driver.getWindowHandles();
		String parentWindow = driver.getWindowHandle();
		Windows.remove(parentWindow);
		String wh = Windows.iterator().next();
		if (wh != parentWindow) {
			String childWindow = wh;
			driver.switchTo().window(childWindow);
			driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		}

	}

}

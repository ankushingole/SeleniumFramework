package ChromeDriver_Tests;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartShopping {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "D:/SELENIUM SOFT/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		// driver.findElement(By.className("_29YdH8")).click();

		// Login action
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9975084148");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("imankush!123456");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		Thread.sleep(3000);

		// Search a product
		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_2cLu-l' and @title='Apple iPhone 6s (Space Grey, 32 GB)']")).click();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		Iterator<String> it = allWindows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		Thread.sleep(3000);
		// System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@class='_2AkmmA iwYpF9 _7UHT_c']")).click();

		driver.findElement(By.xpath("//button[@class='_2AkmmA _I6-pD _7UHT_c']")).click();

	}
}

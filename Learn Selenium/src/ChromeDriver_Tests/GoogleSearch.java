package ChromeDriver_Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");

		Thread.sleep(2000);

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbl1']"));

		System.out.println("No. of search found:" + list.size());

		for (int i = 0; i < list.size(); i++) {

			String options = list.get(i).getText();
			if (options.contains("javatpoint")) {

				list.get(i).click();
				break;
			}
			driver.close();
			
		}
		driver.quit();
	}
	
}

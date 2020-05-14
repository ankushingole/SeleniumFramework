package ChromeDriver_Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.tatamotors.com/");

		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("Total size of links are: " + linklist.size());

		for (int i = 0; i < linklist.size(); i++) {

			String names = linklist.get(i).getText();
			System.out.println(names);

			// driver.quit();
		}
	}

}

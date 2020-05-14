package SeleniumTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links are present: " + links.size());

		for (int i = 0; i < links.size(); i++) 
		{
			String linkText = links.get(i).getText();
			System.out.println(linkText);
		}

		driver.close();

	}
}

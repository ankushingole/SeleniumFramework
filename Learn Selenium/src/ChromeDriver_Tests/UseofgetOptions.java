package ChromeDriver_Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UseofgetOptions {
	WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		WebElement dropdown = driver.findElement(By.id("drop1"));
		Select ss = new Select(dropdown);
		List<WebElement> dropdOptions = ss.getOptions();
		for (int i = 0; i < dropdOptions.size(); i++) {
			System.out.println(dropdOptions.get(i).getText());
		}
		
		driver.quit();

	}

}

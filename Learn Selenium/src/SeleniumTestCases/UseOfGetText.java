package SeleniumTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UseOfGetText {

	public static void main(String[] args) {

		WebDriver driver = null;
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		List<WebElement> languages = driver.findElements(By.id("SIvCob"));
		for (WebElement w : languages) {
			System.out.println(w.getText());
		}
		driver.quit();
	}

}

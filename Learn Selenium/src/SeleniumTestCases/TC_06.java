package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_06 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.gcrit.com/build3/login.php");

		driver.findElement(By.name("email_address")).sendKeys("rushi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();

		try {
			if (driver.findElement(By.linkText("Log Off")).isDisplayed()) {
				
				System.out.println("User logged in successfully---passed");
			}
		} catch (NoSuchElementException e)

		{
			System.out.println("User is not logged in---failed");
		}
		//driver.close();

	}
}

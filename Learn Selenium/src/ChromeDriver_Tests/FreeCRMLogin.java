package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCRMLogin {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");

		driver.findElement(By.name("email")).sendKeys("ankushingole007@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		System.out.println(driver.getTitle());

		driver.close();
	}

}

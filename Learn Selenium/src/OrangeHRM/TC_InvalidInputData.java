package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_InvalidInputData {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		String message = driver.findElement(By.xpath("//span[contains(text(),'Invalid credentials')]")).getText();
		// System.out.println(message);
		if (message.contains("Invalid credentials")) {
			System.out.println("Invalid Login Credentials---Passed");
		}
		// else
		// {
		// System.out.println("Valid Login Credentials---Failed");
		// }
		driver.close();

	}
}

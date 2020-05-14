package SeleniumTestCases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_07_ReadCapche {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.gcreddy.com/forum/index.php");

		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		driver.findElement(By.id("agreed")).click();

		driver.findElement(By.id("username")).sendKeys("Gopal");

		driver.findElement(By.id("email")).sendKeys("gopal@mail.com");

		driver.findElement(By.id("new_password")).sendKeys("admin123");

		driver.findElement(By.id("password_confirm")).sendKeys("admin123");

		System.out.println("Enter capchea");

		Scanner sc = new Scanner(System.in);
		String ConfCode = sc.nextLine();

		driver.findElement(By.id("confirm_code")).sendKeys(ConfCode);

		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

		String message = driver.findElement(By.xpath("//*[@id='message']/div/p")).getText();
		if (message.contains("Your account has been created.")) {

			System.out.println("User is registered---passed");
		} else {

			System.out.println("User not registered---failed");
		}
		sc.close();
		// driver.close();
	}
}

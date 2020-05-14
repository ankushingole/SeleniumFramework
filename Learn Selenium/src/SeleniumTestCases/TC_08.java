package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_08 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.gcrit.com/build3/admin/login.php");

		driver.findElement(By.linkText("Online Catalog")).click();
		Thread.sleep(3000);

		String url = driver.getCurrentUrl();

		if (url.equals("http://www.gcrit.com/build3/")) {

			System.out.println("Before login: Application redirecteing from admin to user interface---Passed");
		}

		else {

			System.out.println("Before login: Not redirectring---failed");
		}

		driver.navigate().back();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		Thread.sleep(3000);
		String url2 = driver.getCurrentUrl();

		if (url2.contains("http://www.gcrit.com/build3/admin/index.php")) {
			driver.findElement(By.linkText("Online Catalog")).click();
			Thread.sleep(3000);
		}
		String url3 = driver.getCurrentUrl();
		
		if (url3.equals("http://www.gcrit.com/build3/")) {

			System.out.println("After login:  Application redirecteing from admin to user interface---Passed");
		} else {

			System.out.println("After login:  Application not redirecteing from admin to user interface---failed");

		}

		// driver.close();

	}

}

package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FlipkartLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.flipkart.com/");

		String title = driver.getTitle();
		System.out.println("Page Title is: " + title);

		driver.findElement(By.linkText("Login & Signup"));

		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9975084148");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("ankush");
		boolean ele = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).isDisplayed();
		System.out.println(ele);
		Thread.sleep(3000);

		String actual = driver.getCurrentUrl();
		if (actual.equals("https://www.flipkart.com/")) {

			System.out.println("Logged in Successful---Passed");

		} else {
			System.out.println("Login failed---Failed");
		}

		driver.close();
	}
}

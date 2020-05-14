package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_03 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Java")).click();
		Thread.sleep(3000);

		String url = driver.getCurrentUrl();
		// System.out.println(url);

		if (!url.contains("wikipedia.org")) {

			System.out.println("It is inbound link--passed");
			
		} else {

			System.out.println("it s is an outbound link---failed");
		}

		driver.navigate().back();

		driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		Thread.sleep(3000);

		String url2 = driver.getCurrentUrl();

		if (url2.contains("wikipedia.org")) {
			
			System.out.println("It is an outbound link---passed");
			
		} else {
			
			System.out.println("It is an inbound link---failed");
			driver.close();
		}

	}

}

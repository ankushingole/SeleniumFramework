package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_VerifyIntandExtLinksWikipedia {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		//System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
		//System.out.println(url);

		if (url.contains("wikipedia.org")) {
			System.out.println("It is an internal link-Redirected to same page-Passed");
		} else {
			System.out.println("It is an external link-Redirected to other appplication-Failed");
		}
		driver.navigate().back();
		driver.findElement(By.partialLinkText("seleniumhq.org")).click();
		url = driver.getCurrentUrl();

		if (!url.contains("wikipedia.org")) {
			System.out.println("It is an external link- Redirected to another page in other application--Passed");
		} else {
			System.out.println("It is an external link- Redirected to another page int the same application--Failed");
		}
		driver.close();
	}
}
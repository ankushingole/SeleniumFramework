package SeleniumTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_12_PageTitleTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");

		String title = driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		driver.close();
	}

}

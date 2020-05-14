package ChromeDriver_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.close();
		
	}

}

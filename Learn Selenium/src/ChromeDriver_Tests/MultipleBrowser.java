package ChromeDriver_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class MultipleBrowser {
	static WebDriver driver;
	static int browser;
	static String BrowserName;

	public static void main(String[] args) {

		for (browser = 1; browser <= 3; browser++) {
			if (browser == 1) {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				BrowserName = "Firefox Browser";
			}
			else if (browser == 2) {
				System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				BrowserName = "Chrome Driver";
			} 
			else if (browser == 3) {
				System.setProperty("webdriver.chrome.driver", "‪D:\\SELENIUM SOFT\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				BrowserName = "Internet Explorer Driver";
			}
			driver.get("https://www.google.co.in");

			String pageTitle = driver.getTitle();
			if (pageTitle.equals("Google")) {

				System.out.println(BrowserName + ":" + "- Google application launched--Passed");
			} else {

				System.out.println(BrowserName + ":" + "- Google application not launched--failed");
			}
			driver.close();
		}

	}

}

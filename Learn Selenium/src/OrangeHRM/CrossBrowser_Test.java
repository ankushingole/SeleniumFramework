package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Test {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifyTitle(String browserName) {

		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:/Eclipse Workspace/LearnSelenium/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", "D:/Eclipse Workspace/LearnSelenium/Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Title found " + driver.getTitle());
		driver.close();
	}

}

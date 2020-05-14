package April_2020_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Launch_Browser {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "D:/SELENIUM SOFT/Drivers/MicrosoftWebDriver.exe");
		DesiredCapabilities browser = new DesiredCapabilities();
		browser.setBrowserName(DesiredCapabilities.edge().getBrowserName());
		driver = new EdgeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}

}

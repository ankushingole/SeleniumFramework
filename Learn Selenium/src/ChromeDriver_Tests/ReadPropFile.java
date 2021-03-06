package ChromeDriver_Tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("D:/Eclipse Workspace/LearnSelenium/src/ChromeDriver/config.properties");

		prop.load(fis);

		System.out.println(prop.getProperty("name"));

		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");

		System.out.println(url);

		String browserName = prop.getProperty("browser");

		System.out.println(browserName);

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "/D:/SELENIUM SOFT/chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("FF")) {

			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {

			driver = new InternetExplorerDriver();
		}

		// driver.get(url);
	}

}

package ChromeDriver_Tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
	}

	public static void takeScreenshot(String filename) throws IOException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("/D:/Eclipse Workspace/LearnSelenium/src/screenshots/anku.png"));
		// System.out.println(file);
		driver.close();
	}

}

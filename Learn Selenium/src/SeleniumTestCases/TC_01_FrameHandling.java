package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01_FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
	}
}
package ChromeDriver_Tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize chrome window

		driver.get("https://www.naukri.com");

		driver.findElement(By.xpath("//input[@id='input_resumeParser']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Anki\\Documents\\CVupload.exe");

	}
}

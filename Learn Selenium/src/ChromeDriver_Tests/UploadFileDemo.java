package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:/Users/Anki/Desktop/PIYUSH new.pdf");
		System.out.println("Upload successful");
		Thread.sleep(5000);
		driver.quit();
	}

}

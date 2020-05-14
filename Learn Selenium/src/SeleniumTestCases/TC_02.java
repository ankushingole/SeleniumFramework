package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//a[@class='gb_z gb_pc']")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath ("//*[@id='gb36']/span[1]")).click();
		
		//driver.close();
	}
}

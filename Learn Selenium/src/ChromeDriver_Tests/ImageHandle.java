package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageHandle {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.seleniumhq.org/");
		System.out.println(driver.findElement(By.className("icon")).isDisplayed());
		driver.close();
	}

}

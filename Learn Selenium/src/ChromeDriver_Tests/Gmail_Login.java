package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.gmail.com");

		driver.findElement(By.name("identifier")).sendKeys("ingoleam89");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2500);
		driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).sendKeys("19_imankush");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		System.out.println("Login successful");
		driver.close();
	}

}

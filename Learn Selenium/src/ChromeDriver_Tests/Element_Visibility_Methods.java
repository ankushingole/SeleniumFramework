package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Visibility_Methods{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		// 1. isDisplayed()
		boolean login = driver.findElement(By.xpath("//input[@id='u_0_a']")).isDisplayed();
		System.out.println(login);

		// 2. isEnabled()
		boolean login2 = driver.findElement(By.xpath("//input[@id='u_0_a']")).isEnabled();
		System.out.println(login2);

		// 3. isSelected()
		driver.findElement(By.xpath("//select[contains(@id,'day')]")).click();
		//Thread.sleep(3000);
		boolean day = driver.findElement(By.xpath("//select[contains(@id,'day')]")).isSelected();
		System.out.println(day);

		//driver.close();

	}
}

package ChromeDriver_Tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		// ChromeDriver driver = new ChromeDriver();

		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		System.out.println("Before login, title is: " + driver.getTitle());

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anku4148");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("imankush");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println("After login, title is: " + driver.getTitle());
	}
}

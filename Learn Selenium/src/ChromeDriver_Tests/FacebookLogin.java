package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement uname = driver.findElement(By.name("email"));
		uname.sendKeys("anku4148");

		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("imankush");

		WebElement loginBtn = driver.findElement(By.id("loginbutton"));
		String text=loginBtn.getText();
		System.out.println(text);

		driver.quit();

	}

}

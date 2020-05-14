package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Actions {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		// System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM
		// SOFT\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.linkText("Admin"))).build().perform();
		act.moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).build().perform();
		Thread.sleep(2000);

		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		driver.quit();

	}

}

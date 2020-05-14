package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement user_mgmt = driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement users = driver.findElement(By.id("menu_admin_viewSystemUsers"));

		Actions act = new Actions(driver);
		// act.moveToElement(admin).build().perform();
		// act.moveToElement(user_mgmt).build().perform();
		// act.moveToElement(users).click().build().perform();

		// We can perform single line operation also
		act.moveToElement(admin).moveToElement(user_mgmt).moveToElement(users).click().build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}

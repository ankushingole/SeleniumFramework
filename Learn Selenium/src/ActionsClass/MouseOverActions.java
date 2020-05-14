package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		// Thread.sleep(2000);

		WebElement admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement usermgmt = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));

		Actions act = new Actions(driver);
		act.moveToElement(admin).moveToElement(usermgmt).moveToElement(users).click().build().perform();

		Actions ac = new Actions(driver);
		WebElement Clicktoadmin = driver.findElement(By.className("panelTrigger"));
		ac.moveToElement(Clicktoadmin).click().build().perform();

		driver.quit();

	}
}
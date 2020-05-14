package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_02 extends UserDefMethodsLogin {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM
		// SOFT\\chromedriver.exe");
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		// driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		// driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		// driver.findElement(By.id("btnLogin")).click();

		TC_02 obj = new TC_02();
		obj.launchBrowser();
		obj.Login("Admin", "admin123");

		WebElement leave = driver.findElement(By.xpath("//a[(@id='menu_leave_viewLeaveModule')]"));
		WebElement assignLeave = driver.findElement(By.xpath("//a[contains(text(),'Assign Leave')]"));

		Actions act = new Actions(driver);
		act.moveToElement(leave).moveToElement(assignLeave).click().build().perform();
	}

}

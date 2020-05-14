package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserDefMethodsLogin {

	static WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void Login() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	}

	public void Login(String uname, String pass) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
	}

	public void closeBrowser() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		UserDefMethodsLogin m1 = new UserDefMethodsLogin();
		m1.launchBrowser();
		m1.Login();
		m1.Login("Admin", "admin123");
		m1.closeBrowser();
	}
}

package HandlingElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("login")).sendKeys("ankush");
		Thread.sleep(2500);
		System.out.println(driver.findElement(By.name("login")).getAttribute("value_style"));
		 driver.findElement(By.name("proceed")).click();
		
		 Alert al = driver.switchTo().alert();
		 String msg = al.getText();
		 System.out.println(msg);
		 al.accept();
		 System.out.println(driver.findElement(By.name("proceed")).getAttribute("type"));
		 System.out.println(driver.findElement(By.name("proceed")).getAttribute("title"));
		 System.out.println(driver.findElement(By.name("proceed")).getAttribute("value"));
		driver.close();

	}
}

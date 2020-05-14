package ChromeDriver_Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept(); //click on Ok button
		
		
		
		
	}

}

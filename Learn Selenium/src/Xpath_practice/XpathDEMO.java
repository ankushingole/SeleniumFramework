package Xpath_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDEMO {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");

		// use following
		// driver.findElement(By.xpath("//label[text()='Username or Email
		// Address']//following::input[4]"));

		// use preceding
		// driver.findElement(By.xpath("//*[@id='wp-submit']//preceding::input[1]"));

		driver.findElement(By.xpath("//input[contains(@id,'user_login')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("demo123");
		driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
		System.out.println("login success");
		driver.quit();
	}

}

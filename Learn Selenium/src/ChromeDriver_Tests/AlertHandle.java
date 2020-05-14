package ChromeDriver_Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");

		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println("Text on button is: " + alert.getText());
		
		String text = alert.getText();

		if (text.equals("Please enter a valid user name")) {
			
			System.out.println("This is correct message");
		} 
		else {

			System.out.println("This is not a correct message");
		}

		alert.accept(); /// click on OK button

		// alert.dismiss(); ///click on CANCEL button

		driver.quit();
	}

}

package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_NaukriResumeUpdate {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com");

		// Login to Naukri Profile
		driver.findElement(By.xpath("//a[@title='Jobseeker Login']")).click();
		driver.findElement(By.name("email")).sendKeys("ingoleam89@gmail.com");
		driver.findElement(By.name("PASSWORD")).sendKeys("india@123456");
		driver.findElement(By.xpath("//button[@value='Login']")).click();
		System.out.println("Login Successful");

		// After Login successful, select profile & update resume
		driver.findElement(By.xpath("//div[@class='user-name roboto-bold-text']")).click();
		driver.findElement(By.xpath("//input[@id='attachCV']"))
				.sendKeys("C:/Users/Anki/Desktop/Ankush_Ingole_QA_Exp.docx");
		System.out.println("Resume has been updated successfully");

	}

}

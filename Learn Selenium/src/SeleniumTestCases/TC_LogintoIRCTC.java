package SeleniumTestCases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LogintoIRCTC {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.findElement(By.id("loginText")).click();
		driver.findElement(By.id("userId")).sendKeys("ankingole");
		driver.findElement(By.id("pwd")).sendKeys("aakolaa");

		// Read captcha
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Captcha");
		String captcha = scan.nextLine();
		driver.findElement(By.id("nlpAnswer")).sendKeys(captcha);
		driver.findElement(By.xpath("//button[contains(text(),'SIGN IN')]")).click();
		String url = driver.getCurrentUrl();

		if (url.equals("https://www.irctc.co.in/nget/train-search")) {
			System.out.println("Login Successful----Passed");
		} else {

			System.out.println("Login failed---Failed");
		}
		scan.close();
		driver.close();
	}

}

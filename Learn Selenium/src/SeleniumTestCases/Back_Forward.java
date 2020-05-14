package SeleniumTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back_Forward {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.com");
		System.out.println("Google");
		
		driver.navigate().to("http://www.audi.com");
		System.out.println("Audi");

		driver.navigate().back();
		System.out.println("Google");
		
		driver.navigate().forward();
		System.out.println("Audi");
		
		driver.close();
	}

}

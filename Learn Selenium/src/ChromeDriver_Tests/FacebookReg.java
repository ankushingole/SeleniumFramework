package ChromeDriver_Tests;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		System.out.println(driver.getCurrentUrl());

	}

}

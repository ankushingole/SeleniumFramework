package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecuterFlash {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("anku");
		driver.findElement(By.name("pass")).sendKeys("imankush");
		WebElement login = driver.findElement(By.xpath("//input[@id='u_0_a']"));

		flash(login, driver);
	}

	public static void flash(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,400,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}

	private static void changeColor(String color, WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolor= '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

		}
	}

}

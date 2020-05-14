package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		act.contextClick(button).build().perform(); // Right click on button

		driver.findElement(By
				.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']//span[contains(text(),'Paste')]"))
				.click(); // Select Paste option

		System.out.println(driver.switchTo().alert().getText()); // switch to alert
																	
		driver.switchTo().alert().accept(); // dismiss alert box

		driver.quit();

	}

}

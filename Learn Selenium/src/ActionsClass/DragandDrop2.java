package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement sourceElement = driver.findElement(By.id("box2"));
		WebElement targetElement = driver.findElement(By.id("countries"));

		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement).build().perform();

		//action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}

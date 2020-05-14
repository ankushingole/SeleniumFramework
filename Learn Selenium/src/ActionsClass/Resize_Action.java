package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_Action {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://strml.github.io/react-resizable/examples/1.html");

		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		WebElement resize = driver.findElement(
				By.xpath("//div[@class='box box react-resizable']//span[@class='react-resizable-handle']"));

		Actions act = new Actions(driver);
		act.moveToElement(resize).dragAndDropBy(resize, 250, 150).build().perform();

		Thread.sleep(3000);

		driver.quit();
	}

}

package April_2020_Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01_FindMultipleElements {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");

		List<WebElement> textboxes = driver.findElements(By.xpath("//input"));
		System.out.println("Count of all textboxes and inputs on webpage are: " + textboxes.size());

		String name = driver.findElement(By.xpath("//label[contains(text(),'Full Name')]")).getText();
		System.out.println("The label name is: " + name);

		driver.quit();
	}

}

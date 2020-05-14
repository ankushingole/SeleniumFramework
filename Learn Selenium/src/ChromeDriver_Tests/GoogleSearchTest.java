package ChromeDriver_Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Akola");

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		//Thread.sleep(3000);
		System.out.println("Total no.of suggestions are: " + list.size());
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
		}
		//driver.close();
	}

}

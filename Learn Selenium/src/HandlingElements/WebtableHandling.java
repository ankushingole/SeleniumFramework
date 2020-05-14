package HandlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file://C:/Users/Anki/Desktop/TestData/Webtable1.html");

		WebElement table = driver.findElement(By.id("table1"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int r = rows.size();
		System.out.println("Total rows:"+r);

		List<WebElement> cols = table.findElements(By.tagName("td"));
		int c = cols.size();
		System.out.println("Total columns:"+c);
	}
}

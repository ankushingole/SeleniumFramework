package HandlingElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelect {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Select dropdown = new Select(driver.findElement(By.name("birthday_day")));
		List<WebElement> ll = dropdown.getOptions();
		int count = ll.size();
		System.out.println("Total days are:"+count);

		driver.close();
	}

}

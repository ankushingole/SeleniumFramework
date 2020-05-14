package HandlingWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH_Naukri {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.naukri.com/");

		Thread.sleep(2000);

		Set<String> allwindowshandler = driver.getWindowHandles();

		int count = allwindowshandler.size();
		System.out.println(count);

		Iterator<String> it = allwindowshandler.iterator();
		while (it.hasNext()) {

			String parentWindowID = it.next();
			System.out.println("Parentwindow ID is: " + parentWindowID);

			String childWindowID = it.next();
			System.out.println("ChildWindow id is: " + childWindowID);
			
			driver.switchTo().window(childWindowID);
			Thread.sleep(2000);
			
			System.out.println(driver.getTitle());

			driver.close();

			driver.switchTo().window(parentWindowID);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
		}
	}

}

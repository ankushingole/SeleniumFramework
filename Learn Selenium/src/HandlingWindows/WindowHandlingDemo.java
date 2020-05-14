package HandlingWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com");

		// It will return parent window name as String
		String mainWindow = driver.getWindowHandle();

		// It will return no. of windows opened by WebDriver & return set of String
		Set<String> set = driver.getWindowHandles();

		// Using iterator to iterate within windows
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {

			String childWindow = itr.next();
			if (!mainWindow.equals(childWindow)) {

				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow).getTitle();
	}

}

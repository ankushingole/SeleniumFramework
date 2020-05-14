package HandlingWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WH_ToolsQA {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window handles:" + parent);
		WebElement ele = driver.findElement(By.id("button1"));

		for (int i = 0; i < 3; i++) {
            ele.click();
			Thread.sleep(3000);
		}
		Set<String> allWindow = driver.getWindowHandles();

		for (String handle : allWindow) {
			System.out.println("Window handle: " + handle);
			System.out.println(driver.getTitle());
		}
	}

}

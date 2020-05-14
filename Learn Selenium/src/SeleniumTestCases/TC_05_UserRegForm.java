package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_05_UserRegForm {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=soqflta4mcqae239mhequt6pb7");

		driver.findElement(By.xpath("//input[@value='m']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Admin");
		driver.findElement(By.name("lastname")).sendKeys("admin123");
		driver.findElement(By.name("dob")).sendKeys("12/17/2019");

		driver.findElement(By.name("email_address")).sendKeys("rushi@gmail.com");
		driver.findElement(By.name("street_address")).sendKeys("Manhatton");
		driver.findElement(By.name("postcode")).sendKeys("411055");
		driver.findElement(By.name("city")).sendKeys("Switzerland");
		driver.findElement(By.name("state")).sendKeys("USA");

		Select sel = new Select(driver.findElement(By.name("country")));
		sel.selectByIndex(4);

		driver.findElement(By.name("telephone")).sendKeys("0121523123");

		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("confirmation")).sendKeys("admin123");

		driver.findElement(By.id("tdb4")).click();

		String confMessage = driver.findElement(By.tagName("h1")).getText();

		if (confMessage.equals("Your Account Has Been Created!")) {

			System.out.println("User registered---passed");
		} else {

			System.out.println("User not registered---failed");
		}
		//driver.close();
	}

}

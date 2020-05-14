package SeleniumTestCases;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_MahCourt {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://court.mah.nic.in/courtweb/index_eng.php#");
		WebElement obj = driver.findElement(By.xpath("//div[@id='nav']//a[contains(text(),'Case Status')]"));
		WebElement obj2 = driver.findElement(By.xpath("//div[@id='nav']//a[contains(text(),'Filing Number')]"));

		Actions actions = new Actions(driver);
		actions.moveToElement(obj).perform();
		actions.moveToElement(obj2).click().build().perform();

		Alert al = driver.switchTo().alert();
		al.accept();

		Select sel = new Select(driver.findElement(By.className("selectdistrict")));
		sel.selectByVisibleText("Akola-अकोला ");

		actions.moveToElement(obj2).click().build().perform();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='data']")));

		driver.findElement(By.xpath("//input[@id='radCourtEst']")).click();

		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.xpath("//select[@id='court_code']")));
		select.selectByVisibleText("Chief Judicial Magistrate , Akola");

		driver.findElement(By.name("filing_no")).sendKeys("12");
		driver.findElement(By.name("rgyear")).sendKeys("2019");
		driver.findElement(By.xpath("//img[@id='captcha_image']"));

		Scanner scan = new Scanner(System.in);
		System.out.println("enter capchea text");
		String capcheCode = scan.nextLine();
		driver.findElement(By.name("captcha")).sendKeys(capcheCode);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		System.out.println("Cases found");
		scan.close();
		driver.close();
	}
}

package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderWebtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://msrtc.maharashtra.gov.in/");
		driver.findElement(By.name("journeydate")).click();

		String date = "28-September-2019";
		String[] dateArr = date.split("-"); // {26,July,2019}
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		Select month1 = new Select(driver.findElement(By.className("datepick-new-month")));
		month1.selectByVisibleText(month);

		Select year1 = new Select(driver.findElement(By.className("datepick-new-year")));
		year1.selectByVisibleText(year);

		// *[@id='datepick-div']/div[3]/table/tbody/tr[5]/td[2]/a

		String before_Xpath = "//*[@id='datepick-div']/div[3]/table/tbody/tr[";
		String after_Xpath = "]/td[";

		boolean flag = false;
		final int totalWeekDays = 7;
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= totalWeekDays; col++) {

				String dayVal = driver.findElement(By.xpath(before_Xpath + row + after_Xpath + col + "]")).getText();
				System.out.println(dayVal);
				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(before_Xpath + row + after_Xpath + col + "]")).click();
					break;
				}
			}
			if (flag) {
				break;
			}
			
			
		}

	}

}

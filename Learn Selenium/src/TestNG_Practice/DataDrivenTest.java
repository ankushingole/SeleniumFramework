package TestNG_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTest {
	static WebDriver driver;

	@Test(dataProvider = "testdata")
	public void adminLogin(String User, String Password) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys(User);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://www.gcrit.com/build3/admin/index.php");

	}

	@AfterMethod
	public void closeBrowser() {

		driver.close();
	}

	@DataProvider(name = "testdata")
	public Object[][] readExcel() throws BiffException, IOException {

		File f = new File("C:/Users/Anki/Desktop/Input.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		int rows = s.getRows();
		int cols = s.getColumns();
		// System.out.println(rows);
		// System.out.println(cols);

		String[][] inputData = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				Cell c = s.getCell(j, i);
				inputData[i][j] = c.getContents();
				// System.out.println(inputData[i][j]);
			}
		}
		return inputData;

	}

}

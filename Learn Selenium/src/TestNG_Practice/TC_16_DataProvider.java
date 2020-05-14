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

public class TC_16_DataProvider {
	public static WebDriver driver;

	@Test(dataProvider = "testData")
	public void adminLogin(String uname, String password) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys(uname);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());

	}

	@AfterMethod()
	public void closeBrowser() {
		driver.close();
	}

	@DataProvider(name = "testData")
	public Object[][] readExcel() throws BiffException, IOException {
		File f = new File("C:/Users/Anki/Desktop/Input.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Login");
		int columns = s.getColumns();
		int rows = s.getRows();
		// System.out.println(columns + "," + rows);

		String[][] inputData = new String[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Cell c = s.getCell(j, i);
				inputData[i][j] = c.getContents();
				System.out.println(inputData[i][j]);

			}
		}
		return inputData;

	}
}

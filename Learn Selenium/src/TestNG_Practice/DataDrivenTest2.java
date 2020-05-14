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

public class DataDrivenTest2 {
	static WebDriver driver;

	@Test(dataProvider = "orangehrm")
	public void adminLogin(String User, String Password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys(User);
		driver.findElement(By.name("txtPassword")).sendKeys(Password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);

		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}

	@AfterMethod
	public void closeBrowser() {

		driver.close();
	}

	@DataProvider(name = "orangehrm")
	public Object[][] getexcelData()throws BiffException, IOException {

		File ff = new File("C:/Users/Anki/Desktop/Input.xls");
		Workbook ww = Workbook.getWorkbook(ff);
		Sheet s = ww.getSheet(2);
		int rows = s.getRows();
		int cols = s.getColumns();
//		System.out.println(rows);
//		System.out.println(cols);

		String[][] inputData = new String[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				Cell cc=s.getCell(j,i);
				inputData[i][j]=cc.getContents();
				//System.out.println(inputData[i][j]);
			}
		}
		return inputData;


	}
}

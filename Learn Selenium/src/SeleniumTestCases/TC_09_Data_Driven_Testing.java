package SeleniumTestCases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_09_Data_Driven_Testing {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		FileReader file = new FileReader("C:\\Users\\Anki\\Desktop\\Testdata.txt");
		BufferedReader br = new BufferedReader(file);

		String line;
		int Iteration = 0;

		while ((line = br.readLine()) != null) {
			Iteration = Iteration + 1;

			driver = new ChromeDriver();
			driver.manage().window().maximize();

			if (Iteration > 1) {
				String inputData[] = line.split(",", 2);

				driver.get("http://www.gcrit.com/build3/admin/login.php");
				driver.findElement(By.name("username")).sendKeys(inputData[0]);
				driver.findElement(By.name("password")).sendKeys(inputData[1]);
				driver.findElement(By.id("tdb1")).click();

				String url = driver.getCurrentUrl();

				if (url.contains("http://www.gcrit.com/admin/inde.php")) {
					System.out.println(Iteration + " Admin login is successful---passed");
				} else {

					System.out.println(Iteration + " Admin login is unsuccessful---failed");
				}
			}
		}
		br.close();
	}
}

package SeleniumTestCases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_10 {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		FileReader file = new FileReader("C:\\Users\\Anki\\Desktop\\TestData\\Testdata.txt");
		BufferedReader br = new BufferedReader(file);

		String line;
		int Iteration = 0;

		while ((line = br.readLine()) != null) {
			Iteration = Iteration + 1;

			if (Iteration > 0) {
				String inputData[] = line.split(",", 2);

				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=ugglvtr6mqkisg3fbrqbujqam6");

				driver.findElement(By.name("username")).sendKeys(inputData[0]);
				driver.findElement(By.name("password")).sendKeys(inputData[1]);
				driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
			//	String url = driver.getCurrentUrl();

				String ErrorMsg = driver.findElement(By.className("messageStackError")).getText();
				System.out.println(ErrorMsg);

				if (Iteration == 4 && ErrorMsg.contains("Error: The maximum number of login attempts has been reached. Please try again in 5 minutes.")) {
					System.out.println(Iteration + " Maximum invalid login attempts are over---passed");

				} else if ((Iteration < 4 && ErrorMsg.contains("Error: Invalid administrator login attempt."))) {

					System.out.println(Iteration + " Maximum invalid login attempts are not over---passed");

				} else {

					System.out.println(Iteration + " Maximum invalid login attempts are not over---failed");
				}
				driver.close();
			}

		}
		br.close();
		file.close();
	}

}

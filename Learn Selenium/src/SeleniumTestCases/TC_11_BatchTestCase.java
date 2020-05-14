package SeleniumTestCases;

import java.io.BufferedReader;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_11_BatchTestCase {

	static WebDriver driver;
	static String url;

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM SOFT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void closeBrowser() {

		driver.close();
	}

	// Admin login

	public void adminLogin(String uname, String ps) {
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

	}

	public static void main(String[] args) throws Exception {
		FileReader file = new FileReader("C:\\Users\\Anki\\Desktop\\Testdata\\Testdata - Copy.txt");
		BufferedReader br = new BufferedReader(file);
		TC_11_BatchTestCase obj = new TC_11_BatchTestCase();

		// Test case 01: Verify Admin Login with valid input data
		
		String line;
		int Iteration = 0;
 
		while ((line = br.readLine()) != null) {
			Iteration = Iteration+1;

			if (Iteration > 1) {
				String inputData[] = line.split(",", 2);
				obj.launchBrowser(); 
				obj.adminLogin(inputData[0], inputData[1]);

				url = driver.getCurrentUrl();
				if (url.contains("http://www.gcrit.com/build3/admin/index.php"))
				{

					System.out.println("Test case 1- Iteration:"+(Iteration-1)+" Admin Login is successful ---Passed");
				}
				else
				{
					System.out.println("Test case 1: Iteration-"+(Iteration-1)+" Admin Login is unsuccessful ---Failed");
				}

				obj.closeBrowser();
			}
		}

		// Test case 2: Verify Error message in Admin login
		// functionality(Neagtive test case)
 
		obj.launchBrowser();
		obj.adminLogin("admin1", "admin123");

		String errorMsg = driver.findElement(By.className("messageStackError")).getText();

		if (errorMsg.contains("Error: Invalid administrator login attempt.")) {

			System.out.println("Test case 2: Admin login unsuccessful & showing correct error msg---Passed");
		} else {

			System.out.println("Test case 2: Admin login unsuccessful & not showing correct error msg---Failed");
		}
		obj.closeBrowser();

		// Test case 3: Verify "Redirect" functionality (From Admin to
		// user
		// interface)

		obj.launchBrowser();
		obj.adminLogin("admin", "admin@123");

		driver.findElement(By.linkText("Online Catalog")).click();
		url = driver.getCurrentUrl();

		if (url.contains("http://www.gcrit.com/build3")) {

			System.out.println("Test case 3: Application redirected from Admin to user interface--Passed");
		} else {

			System.out.println("Test case 3: Application not redirected from Admin to user interface--Failed");
		}
		obj.closeBrowser();
	}

}

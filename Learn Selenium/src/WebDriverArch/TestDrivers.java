package WebDriverArch;

public class TestDrivers {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement("name");
		driver.close();
		driver.quit();
	}

}
 
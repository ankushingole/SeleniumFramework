package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IE_TestCase {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", path + "‪D:\\SELENIUM SOFT\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver = new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}

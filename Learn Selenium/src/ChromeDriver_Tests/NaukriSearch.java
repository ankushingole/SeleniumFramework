package ChromeDriver_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriSearch {

	public static void main(String[] args) {
		WebDriver obj = new FirefoxDriver();
		obj.navigate().to("https://www.naukri.com/");
		obj.findElement(By.xpath("//*[@id='skill']/div[1]/div[2]/input")).sendKeys("Software Testing");
		//obj.findElement(By.xpath("//span[@class='blueBtn']")).click();
 }

}

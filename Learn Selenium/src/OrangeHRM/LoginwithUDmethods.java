package OrangeHRM;

import org.openqa.selenium.By;

public class LoginwithUDmethods extends UserDefMethodsLogin {

	public static void main(String[] args) throws InterruptedException {

		LoginwithUDmethods obj = new LoginwithUDmethods();
		obj.launchBrowser();
		obj.Login("Admin", "admin123");
		String welcomeText = driver.findElement(By.id("welcome")).getText();
		if (welcomeText.equals("Welcome Admin")) {

			System.out.println("Login to Admin interface successfully--Passed");

		} else {
			System.out.println("Login unsuccessful---Failed");
		}
		obj.closeBrowser();
	}
}

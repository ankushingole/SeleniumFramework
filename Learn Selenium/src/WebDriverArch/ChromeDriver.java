package WebDriverArch;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() {

		System.out.println("launch browser");
	}

	@Override
	public void get(String url) {
		System.out.println("Enter url " + url);

	}

	@Override
	public void findElement(String locator) {
		System.out.println("find the element " + locator);

	}

	@Override
	public void close() {

		System.out.println("close the browser");

	}

	@Override
	public void quit() {
		System.out.println("Close all browsers");

	}

}

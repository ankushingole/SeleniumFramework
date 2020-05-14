package TestNG_Practice;

import org.testng.annotations.Test;

public class TC_13_ParallelTests {

	@Test
	public void tc_01() {
		long id = Thread.currentThread().getId();
		System.out.println("TC01 is successful" + "Thread count is: " + id);
	}

	@Test
	public void tc_02() {
		long id = Thread.currentThread().getId();
		System.out.println("TC02 is successful" + "Thread count is: " + id);
	}

	@Test
	public void tc_03() {
		long id = Thread.currentThread().getId();
		System.out.println("TC03 is successful" + "Thread count is: " + id);
	}

	@Test
	public void tc_04() {
		long id = Thread.currentThread().getId();
		System.out.println("TC04 is successful" + "Thread count is: " + id);
	}
}

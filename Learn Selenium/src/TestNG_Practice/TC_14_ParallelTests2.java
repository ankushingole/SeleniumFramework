package TestNG_Practice;

import org.testng.annotations.Test;

public class TC_14_ParallelTests2 {

	@Test
	public void tc_05() {
		long id = Thread.currentThread().getId();
		System.out.println("TC05 is successful" + "Thread count is: " + id);
	}

	@Test
	public void tc_06() {
		long id = Thread.currentThread().getId();
		System.out.println("TC06 is successful" + "Thread count is: " + id);
	}

	@Test
	public void tc_07() {
		long id = Thread.currentThread().getId();
		System.out.println("TC07 is successful" + "Thread count is: " + id);
	}

	@Test
	public void tc_08() {
		long id = Thread.currentThread().getId();
		System.out.println("TC08 is successful" + "Thread count is: " + id);
	}
}

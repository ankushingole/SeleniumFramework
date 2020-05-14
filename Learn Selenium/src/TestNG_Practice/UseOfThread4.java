package TestNG_Practice;

import org.testng.annotations.Test;

public class UseOfThread4 {
	
  @Test
  public void testCase13() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC13 successful"+ "Thread count is "+id);
  }
  
  @Test
  public void testCase14() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC14 successful"+ "Thread count is "+id);
  }
  
  
  @Test
  public void testCase15() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC15 successful"+ "Thread count is "+id);
  }
  
  
  @Test
  public void testCase16() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC16 successful"+ "Thread count is "+id);
  }
}

package TestNG_Practice;

import org.testng.annotations.Test;

public class UseOfThread3 {
	
  @Test
  public void testCase9() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC9 successful"+ "Thread count is "+id);
  }
  
  @Test
  public void testCase10() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC10 successful"+ "Thread count is "+id);
  }
  
  
  @Test
  public void testCase11() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC11 successful"+ "Thread count is "+id);
  }
  
  
  @Test
  public void testCase12() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC12 successful"+ "Thread count is "+id);
  }
}

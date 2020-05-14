package TestNG_Practice;

import org.testng.annotations.Test;

public class UseOfThread2 {
	
  @Test
  public void testCase5() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC5 successful"+ "Thread count is "+id);
  }
  
  @Test
  public void testCase6() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC6 successful"+ "Thread count is "+id);
  }
  
  
  @Test
  public void testCase7() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC7 successful"+ "Thread count is "+id);
  }
  
  
  @Test
  public void testCase8() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC8 successful"+ "Thread count is "+id);
  }
}

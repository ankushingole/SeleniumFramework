package TestNG_Practice;

import org.testng.annotations.Test;

public class UseOfThread {
	
  @Test
  public void testCase1() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC1 successful"+ "Thread count is "+id);
  }
  
  @Test
  public void testCase2() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC2 successful"+ "Thread count is "+id);
  }
  
  
  @Test
  public void testCase3() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC3 successful"+ "Thread count is "+id);
  }
  
  
  @Test
  public void testCase4() {
	  long id=Thread.currentThread().getId();
	  System.out.println("TC4 successful"+ "Thread count is "+id);
  }
}

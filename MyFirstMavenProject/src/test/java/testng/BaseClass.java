package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
  @Test
  public void method3() {
	  System.out.println("In method3");
  }
  
  @Test
  public void method4()
  {
	  System.out.println("In method4");
  }
  
  @BeforeTest
  public void methodBeforeTestBase()
  {
	  System.out.println("method Before Test in base class");
  }
  
  @AfterTest
  public void methodAfterTestBase()
  {
	  System.out.println("method After Test in Base Class");
  }
  
  @BeforeSuite
  public void methodBeforeSuiteInBaseClass()
  {
	  System.out.println("method Before Suite in Base Class");
  }
  
  @AfterSuite
  public void methodAfterSuiteInBaseClass()
  {
	  System.out.println("method After Suite in Base Class");
  }
}

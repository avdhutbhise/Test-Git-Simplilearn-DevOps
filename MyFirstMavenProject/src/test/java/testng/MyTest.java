package testng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest extends BaseClass{
  @Test
  public void method1() {
	  System.out.println("In method1");
  }
  
  @Test
  public void method2()
  {
	  System.out.println("In method2");
  }
  
  @BeforeTest
  public void methodBeforeTest()
  {
	  System.out.println("method Before Test");
  }
  
  @AfterTest
  public void methodAfterTest()
  {
	  System.out.println("method After Test");
  }
  
  @BeforeMethod
  public void methodBeforeMethod()
  {
	  System.out.println("method Before Method");
  }
  
  @AfterMethod
  public void methodAfterMethod()
  {
	  System.out.println("method After Method");
  }
  
  @BeforeSuite
  public void methodBeforeSuite()
  {
	  System.out.println("method Before Suite");
  }
  
  @AfterSuite
  public void methodAfterSuite()
  {
	  System.out.println("method After Suite");
  }
  
  @BeforeClass
  public void methodBeforeClass()
  {
	  System.out.println("method Before Class");
  }
  
  @AfterClass
  public void methodAfterClass()
  {
	  System.out.println("method After Class");
  }
}

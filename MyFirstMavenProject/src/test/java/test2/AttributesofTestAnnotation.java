package test2;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AttributesofTestAnnotation {
  @Test
  public void verifyUserCanLogin() 
  {
	System.out.println("Verified User Can Login"); 
	Assert.assertTrue(true);  
  }
  
  @Test (dependsOnMethods = {"verifyUserCanLogin"})
  public void verifyUserCanSendMail()
  {
	  System.out.println("Verified User Can Send Mail");
	  Assert.assertTrue(true);
  }
  
  @Test(enabled=false)
  public void verifyTitleofWebPage()
  {
	  System.out.println("Verified Title of Web Page");
	  Assert.assertTrue(true);
  }
  
  @Test (invocationCount = 3)
  public void test()
  {
	  System.out.println("Test Page");
	  Assert.assertTrue(true);
  }
  
}

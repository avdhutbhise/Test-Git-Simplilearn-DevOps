package testng;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotEqualsDeep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
	
	WebDriver driver;
	
	@BeforeTest
	public void browser_launch() {
		String path=System.getProperty("user.dir");
		String actualpath=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	}

	@Test
	public void verifyWebPageTitle() {
		
		String expectedTitle = "Tools QA";			//ToolsQA
		boolean x = driver.getTitle().equals(expectedTitle);
	
		System.out.println(driver.getTitle());
		System.out.println(x);
		
		SoftAssert soft=new SoftAssert();
		AssertJUnit.assertTrue(x);					//Expected value is True
		soft.assertAll();

		//Assert.assertEquals(actualTitle, expectedTitle);
		//assertNotEquals(actualTitle, expectedTitle);
		//Assert.assertFalse(x,"Test Case is Failed");	//Expected is False
		//Assert.assertNull(expectedTitle); 	//Expected value is Null means Empty
		
		//Assert.assertNotNull(expectedTitle);	//Expected value inside String
		
		//Hard Asserts ----> Throwing Exception when Test Case is Failed
	}

	@Test
	public void verifyWebPageTitle1() {
		
		String expectedTitle="ToolsQA";	//ToolsQA
		boolean x = driver.getTitle().equals(expectedTitle);
		
		//assertNotEquals(actualTitle, expectedTitle);
		//Assert.assertEquals(actualTitle, expectedTitle);
		
		
		Assert.assertTrue(x);	//Expected is True
	}

	@AfterTest
	public void browser_terminate() {
		driver.close();
	}

}

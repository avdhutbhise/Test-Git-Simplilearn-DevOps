package test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotInSelenium {
 
	WebDriver driver;

	@BeforeTest
	public void browser_launch() {
		String path = System.getProperty("user.dir");
		String actualpath = path + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	}
	
	@Test(invocationCount = 3)
	public void takeScreenshot() throws IOException, InterruptedException
	{
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\ip-slim-3\\eclipse-workspace\\MyFirstMavenProject\\ScreenShot\\Test1234_"+sdf.format(d)+".png"));
		
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
}

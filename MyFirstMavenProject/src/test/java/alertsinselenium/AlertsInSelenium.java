package alertsinselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actualpath=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmButton")).click();
		alt=driver.switchTo().alert();
		String alt_text=alt.getText();
		String actual_text="You clicked a button";
		
		if(alt_text.equals(actual_text))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		alt.dismiss();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("promtButton")).click();
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("vinay");
		alt.accept();
	}

}

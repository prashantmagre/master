package nopCommerceBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import nopCommercePOM.UtilityNopCommerce;






public class BaseNew 
{
	protected static WebDriver driver;
	public void launchBrowser() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Sultan\\software testing notes\\Apps\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.get(UtilityNopCommerce.readDataFromPropertyFile("url"));
		driver.manage().window().maximize();
		Reporter.log("Lauching browser", true);
		UtilityNopCommerce.wait(driver, 1000);
		
		
	}
	
	public static void closingBrowser(WebDriver driver) throws InterruptedException 
	{
		Reporter.log("closing browser", true);
		Thread.sleep(500);
		driver.close();
	}

}

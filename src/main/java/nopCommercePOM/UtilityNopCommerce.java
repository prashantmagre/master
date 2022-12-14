package nopCommercePOM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import org.testng.Reporter;
public class UtilityNopCommerce {

	

	public static String readDataFromPropertyFile(String key) throws IOException
	{
		// create object of properties class
		Properties prop=new Properties();
		
		// create objects of FileInputStream
		
		FileInputStream myFile=new FileInputStream("C:\\Users\\sai\\eclipse-workspace\\NopCommerce\\NopCommerce.properies");
		
		prop.load(myFile);
		
		 String value = prop.getProperty(key);
		 Reporter.log("reading value of"+key+"from property file", true);
		 return value;
	}
	
	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Sultan\\software testing notes\\Apps\\Selenium\\screenshot\\"+fileName+".png");
		FileHandler.copy(scr, dest);
		Reporter.log("taking screenshot", true);
		
	}
	
	public static void scrollInToView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Reporter.log("scrolling into view"+element.getText(), true);
	}
	
	public static void wait(WebDriver driver, int waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		Reporter.log("waiting for"+waittime+"mills", true);
	}

}

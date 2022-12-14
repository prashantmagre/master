package utilityNopeCommerce;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import nopCommerceBase.BaseNew;
import nopCommercePOM.UtilityNopCommerce;



public class Listener extends BaseNew implements ITestListener
{
	
	public void onTestSuccess(ITestResult result) 
	{
		String methodName = result.getName();
	  Reporter.log("TC "+methodName+" is completed successfully", true);	
	}
	


	public void onTestFailure(ITestResult result) 
	{
		String methodName = result.getName();
		Reporter.log("TC "+methodName+" is failed", true);
		try {
			UtilityNopCommerce.takeScreenshot(driver, methodName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) 
	{ 
		String methodName = result.getName();
		Reporter.log("TC "+methodName+" is skipped please check ", true);
		
	}
	
	
}

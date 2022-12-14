package nopCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Reporter;
public class NopCommerceHomePage 
{
	@FindBy(xpath="//a[text()='Log in']") private WebElement logInButton;
	@FindBy(xpath="//a[text()='Register']")private WebElement registerButton;
	
	public  NopCommerceHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogInButton()
	{
		
		logInButton.click();
	
	}
	
	public void clickOnRegisterButton(WebDriver driver)
	{
		UtilityNopCommerce.wait(driver, 1000);
		registerButton.click();
		Reporter.log("click on register button", true);
	}

}

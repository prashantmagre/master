package nopCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NopCommerceLogInPage 
{
 
	@FindBy(id="Email")private WebElement emailField;
	@FindBy(id="Password")private WebElement passwordField;
	@FindBy(id="RememberMe")private WebElement rememberMeCheckBox;
	@FindBy(xpath="//button[text()='Log in']")private WebElement logInButton;
	
	public NopCommerceLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmailId(WebDriver driver,String pass)
	{
		UtilityNopCommerce.wait(driver, 1000);
		emailField.sendKeys(pass);
		Reporter.log("sendinng email", true);
	}
	
	public void sendPasswordField(WebDriver driver, String pass)
	{
		UtilityNopCommerce.wait(driver, 1000);
		passwordField.sendKeys(pass);
		Reporter.log("seinding password", true);
	}
	
	public void clickOnRememberCheckBox(WebDriver driver)
	{
		UtilityNopCommerce.wait(driver, 1000);
		rememberMeCheckBox.click();
		Reporter.log("click on remember check box", true);
	}
	public void clickOnLoginButton(WebDriver driver)
	{
		UtilityNopCommerce.wait(driver, 1000);
		logInButton.click();
		Reporter.log("click on login button", true);
	}
	
}

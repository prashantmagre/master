package nopCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NopCommerceRegisterPage 
{
	@FindBy(id="FirstName")private WebElement firstName;
	@FindBy(id="LastName")private WebElement lastName;
	@FindBy(xpath="//input[@name='Email']")private WebElement email;
	@FindBy(id="Password")private WebElement password;
	@FindBy(id="ConfirmPassword")private WebElement confirmPassword;
	@FindBy(xpath="//button[text()='Register']")private WebElement registerButton;
	@FindBy(xpath="//a[text()='Continue']")private WebElement continueButton;
	
	public NopCommerceRegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendFirstName(WebDriver driver, String pass)
	{
		UtilityNopCommerce.wait(driver, 1000);
		firstName.sendKeys(pass);
		Reporter.log("sending first name", true);
	}

	public void sendLastName(WebDriver driver, String pass)
	{
		UtilityNopCommerce.wait(driver, 1000);
		lastName.sendKeys(pass);
		Reporter.log("sending last name", true);
	}
	
	public void sendEmail(WebDriver driver, String pass)
	{
		UtilityNopCommerce.wait(driver, 1000);
		email.sendKeys(pass);
		Reporter.log("sending email", true);
	}
	public void sendPassword(WebDriver driver, String pass)
	{
		UtilityNopCommerce.wait(driver, 1000);
		password.sendKeys(pass);
		Reporter.log("send password", true);
	}
	public void sendConfirmedPassword(WebDriver driver, String pass)
	{
		UtilityNopCommerce.wait(driver, 1000);
		confirmPassword.sendKeys(pass);
		Reporter.log("send confirm password", true);
	}
	
	public void clickOnRegisterButton(WebDriver driver)
	{
		UtilityNopCommerce.wait(driver, 1000);
		registerButton.click();
		Reporter.log("click on register button", true);
	}
	
	public void clickOnContinueBtton(WebDriver driver)
	{
		UtilityNopCommerce.wait(driver, 1000);
		continueButton.click();
		Reporter.log("click on continue button", true);
	}
}


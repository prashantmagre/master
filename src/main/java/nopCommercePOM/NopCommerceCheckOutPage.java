package nopCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class NopCommerceCheckOutPage 
{
	@FindBy(id="BillingNewAddress_CountryId")private WebElement country;
	@FindBy(id="BillingNewAddress_City")private WebElement cityName;
	@FindBy(id="BillingNewAddress_Address1")private WebElement address;
	@FindBy(id="BillingNewAddress_ZipPostalCode")private WebElement postalCode;
	@FindBy(id="BillingNewAddress_PhoneNumber")private WebElement phoneNum;
	@FindBy(xpath="(//button[@class='button-1 new-address-next-step-button'])[1]") private WebElement continueButton1;
	@FindBy(xpath="(//button[text()='Continue'])[3]")private WebElement continueButton2;
	@FindBy(xpath="(//button[text()='Continue'])[4]")private WebElement continueButton3;
	@FindBy(xpath="(//button[text()='Continue'])[5]")private WebElement continueButton4;
	@FindBy(xpath="//button[text()='Confirm']")private WebElement confirmButton;
	@FindBy(xpath="//strong[text()='Your order has been successfully processed!']")private WebElement successfullText;
	
	@FindBy(xpath="//button[text()='Continue']")private WebElement continueFinalButton;
	public NopCommerceCheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	public void clickOnCuntry(WebDriver driver,String pass)
	{
		UtilityNopCommerce.wait(driver, 1000);
		country.click();
		Select s=new Select(country);
		s.selectByVisibleText(pass);
		Reporter.log("select country name", true);
		
	}
	
	public void sendCityName(String pass)
	{
		
		cityName.sendKeys(pass);
		Reporter.log("send city name", true);
		
	}
	public void sendAreaName(String pass)
	{
		address.sendKeys(pass);
		Reporter.log("send address name", true);
	}
	public void sendPostalCode(String pass)
	{
		postalCode.sendKeys(pass);
		Reporter.log("send pinCode", true);
	}

	public void sendPhoneNum(String pass)
	{
		phoneNum.sendKeys(pass);
		Reporter.log("send phone number", true);
	}
	public void clickOnContinueButton1()
	{
		continueButton1.click();
	}
	public void clickOnContinueButton2()
	{
		continueButton2.click();
	}
	public void clickOnContinueButton3()
	{
		continueButton3.click();
	}
	public void clickOnContinueButton4()
	{
		continueButton4.click();
	}
	public void clickOnConfirmButton()
	{
		confirmButton.click();
	}
	
	public String getTextSuccessfull()
	{
		String actualText=successfullText.getText();
		Reporter.log("getting text", true);
		return actualText;
	}
 	
	public void clickOnFinalContinueButton()
	{
		continueFinalButton.click();
	}
	
}

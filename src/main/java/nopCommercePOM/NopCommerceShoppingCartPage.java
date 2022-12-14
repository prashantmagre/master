package nopCommercePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NopCommerceShoppingCartPage 
{
	@FindBy(xpath="//input[@name='termsofservice']")private WebElement iAgreecheckBox;
	@FindBy(xpath="//button[text()=' Checkout ']")private WebElement checkOutButton;
	
	
	public NopCommerceShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnIAgreeCheckBox(WebDriver driver) throws InterruptedException
	{
		UtilityNopCommerce.scrollInToView(driver, iAgreecheckBox);
		UtilityNopCommerce.wait(driver, 1000);
		iAgreecheckBox.click();
		Reporter.log("click on I agree checkBox", true);
	}
	
	public void clickOnCheckOutButton(WebDriver driver) throws InterruptedException
	{
		UtilityNopCommerce.wait(driver, 1000);
		checkOutButton.click();
		Reporter.log("click on check out button", true);
	}
}

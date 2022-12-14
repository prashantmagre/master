package nopCommercePOM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NopCommerceMyAccountPage 
{
	@FindBy(xpath="(//a[text()='Apparel '])[1]")private WebElement apparelTab;
	@FindBy(xpath="(//a[text()='Accessories '])[3]") private WebElement accessoriesTab;
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")private WebElement addToCartButton;
	@FindBy(xpath="//span[text()='Shopping cart']")private WebElement shoppingCartTab;
	
	
	public NopCommerceMyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnApparelTab(WebDriver driver) throws InterruptedException
	{
		
		//Alert alt = driver.switchTo().alert();
		//alt.accept();
		//Thread.sleep(1000);
	//	alt.dismiss();
	//	Thread.sleep(500);
		apparelTab.click();
	}

	public void clickOnAccesoriesTab(WebDriver driver)
	{
		UtilityNopCommerce.wait(driver, 1000);
		accessoriesTab.click();
		Reporter.log("click on accesories", true);
	}
	public void clickOnAddToCartButton(WebDriver driver)
	{
		UtilityNopCommerce.wait(driver, 1000);
		addToCartButton.click();
		Reporter.log("click add to cart button", true);
	}
	
	public void clickOnShopingCartTab(WebDriver driver)
	{
		UtilityNopCommerce.wait(driver, 1000);
		shoppingCartTab.click();
		Reporter.log("click on shoping cart tab", true);
	}
}


package nopCommerceTest;

import org.testng.annotations.Test;

import nopCommerceBase.BaseNew;
import nopCommercePOM.NopCommerceCheckOutPage;
import nopCommercePOM.NopCommerceHomePage;
import nopCommercePOM.NopCommerceMyAccountPage;
import nopCommercePOM.NopCommerceRegisterPage;
import nopCommercePOM.NopCommerceShoppingCartPage;
import nopCommercePOM.UtilityNopCommerce;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateSuccessFullOrder extends BaseNew {
	NopCommerceRegisterPage register;
	NopCommerceMyAccountPage myaccount;
	NopCommerceShoppingCartPage cart;
	NopCommerceHomePage home;
	NopCommerceCheckOutPage checkout;
	
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException, IOException 
	{
		launchBrowser();
		register =new NopCommerceRegisterPage(driver);
		myaccount=new NopCommerceMyAccountPage(driver);
		cart=new NopCommerceShoppingCartPage(driver);
		home=new NopCommerceHomePage(driver);
		checkout=new NopCommerceCheckOutPage(driver);
		
	  }
	
	@BeforeMethod
	  public void beforeMethod() throws InterruptedException, IOException 
	{
		home.clickOnRegisterButton(driver);
		
		register.sendFirstName(driver,UtilityNopCommerce.readDataFromPropertyFile("userFirstName"));
		register.sendLastName(driver,UtilityNopCommerce.readDataFromPropertyFile("userLastName"));
		register.sendEmail(driver,UtilityNopCommerce.readDataFromPropertyFile("emailId"));
		register.sendPassword(driver,UtilityNopCommerce.readDataFromPropertyFile("password"));
		register.sendConfirmedPassword(driver,UtilityNopCommerce.readDataFromPropertyFile("confirmPassword"));
		register.clickOnRegisterButton(driver);
		register.clickOnContinueBtton(driver);
		
		myaccount.clickOnApparelTab(driver);
		myaccount.clickOnAccesoriesTab(driver);
		myaccount.clickOnAddToCartButton(driver);
		myaccount.clickOnShopingCartTab(driver);
		
		cart.clickOnIAgreeCheckBox(driver);
		cart.clickOnCheckOutButton(driver);
		
		checkout.clickOnCuntry(driver,UtilityNopCommerce.readDataFromPropertyFile("country"));
		checkout.sendCityName(UtilityNopCommerce.readDataFromPropertyFile("city"));
		checkout.sendAreaName(UtilityNopCommerce.readDataFromPropertyFile("address"));
		checkout.sendPostalCode(UtilityNopCommerce.readDataFromPropertyFile("pinCode"));
		checkout.sendPhoneNum(UtilityNopCommerce.readDataFromPropertyFile("mobileNum"));
		checkout.clickOnContinueButton1();
		checkout.clickOnContinueButton2();
		checkout.clickOnContinueButton3();
		checkout.clickOnContinueButton4();
		checkout.clickOnConfirmButton();
		//checkout.clickOnFinalContinueButton();
		
		
		
	  }
	
	
	@Test
  public void f() throws IOException 
	{
		Assert.assertEquals(checkout.getTextSuccessfull(),UtilityNopCommerce.readDataFromPropertyFile("result") ,"TC failed actual and expected result not same");
		UtilityNopCommerce.takeScreenshot(driver, checkout.getTextSuccessfull());
  }
  

  @AfterMethod
  public void afterMethod() 
  {
	  checkout.clickOnFinalContinueButton();
  }

  

  @AfterClass
  public void afterClass() throws InterruptedException 
  {
	  closingBrowser(driver);
  }

}

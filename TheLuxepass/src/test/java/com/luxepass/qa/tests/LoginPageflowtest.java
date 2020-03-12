package com.luxepass.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luxepass.qa.base.TestBase;
import com.luxepass.qa.pages.HomePage;
import com.luxepass.qa.pages.LoginPage;

public class LoginPageflowtest extends TestBase {
	LoginPage loginpage; /* 1. We have declared LoginPage class reference variable with default access Modifier 
	                           so that we could use this reference variable inside any class of this package. Same
	                           is the case with reference variable of home page */
	HomePage homepage; 
	public LoginPageflowtest() 
	{
		super();     /* 1. This statement will call the super/base class(TestBase) constructor
		                   and load the properties file in this class. 
		                2. This statement is mandatory to be used if u are designing your framework 
		                   using properties file. 
		                3. This is done to avoid the nullpointerException when the initialization()
		                   method is called to initialize and use the properties from the properties file.     
		                */
	}
	@BeforeMethod    /*1. Will be executed before the execution of each @Test annotation*/
	public void setUp()  /* As the name indicates this method will create the initial setup of the following things : 
	                        -- Sets up the driver for the required browser with the help of method initialization(). */
	{
	  initialization();
	  loginpage = new LoginPage(); /* Created a LoginPage Class Object and will call 
	                                   it's constructor which will eventually initialize the Object*/ 
	}
   
   @Test(priority=1)
   public void loginpageTitletest()
   {
	   String title= loginpage.validateLoginPageTitle();
	   Assert.assertEquals(title,"The LuxePass");
   }
   
   @Test(priority=2)
   public void luxepassLogotest()
   {
	   boolean isdisplayed= loginpage.validateLogo();
	   Assert.assertTrue(isdisplayed);
   }
   
   @Test(priority=3)
   public void loginPagelogintest() throws InterruptedException
   {
	   homepage=loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	   Thread.sleep(2000);
	   
   }
   @AfterMethod
   public void teardown()
   {
	driver.quit();   
   }
}

package com.luxepass.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luxepass.qa.base.TestBase;

public class LoginPage extends TestBase {
	// PAGE OBJECT REPO : 
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(), 'Login')]")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[text()='Login / Signup']")
	WebElement loginpopup;
	
	@FindBy(xpath="//span[text()='Signup']")
	WebElement signuppopup;
	
	@FindBy(xpath="//div[@id='gtco-logo']")
	WebElement luxepasslogo;
	public LoginPage()
    {
    	PageFactory.initElements(driver,this); /*1. initelements() is used to initialize the Objects of a class.
                                                 2. this keyword indicates the current class it is used in */        	 
    }
	
	public String validateLoginPageTitle()
	{
	return driver.getTitle(); 
	}
	
	public boolean validateLogo()
	{
		return luxepasslogo.isDisplayed(); /* isDisplayed() method tells if a particular element is displayed
		                                      on this page or not */
	}
	
	public HomePage login(String username,String pwd) throws InterruptedException              
	{    
		loginpopup.click();
		email.sendKeys(username);        /* 1. Landing page for the login pop-up is the Home page. 
                                                                    2. this method will return the Home page 
                                                                       object because of point #1. 
                                                                    3. Return type of the login method is the HomePage class. */
		password.sendKeys(pwd);
		loginbtn.click();
		Thread.sleep(2000);
		return new HomePage(); 
	}
}

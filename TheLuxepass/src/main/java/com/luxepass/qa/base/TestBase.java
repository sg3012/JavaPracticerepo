package com.luxepass.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.luxepass.qa.util.TestUtil;

public class TestBase {
    public static WebDriver driver; /* 1. this is declared as public so that we could use it in the child class of different package
	                                   2. This is declared as static so there is no need of an object to call 
	                                      this variable. */ 
	public static Properties prop;  /* 1. this is declared as public so that we could use it in the child class of different package
                                       2. This is declared as static so there is no need of an object to call 
                                          this variable. */
	public static WebDriverWait wait; 
	static String driverpath; 
	static String browsername; 
	public TestBase()
	{
		try 
		{
		prop=new Properties();
		FileInputStream ip = new FileInputStream("D:\\Automation\\Workspace"
				+ "\\TheLuxepass\\src\\main\\java\\com\\luxepass\\qa\\config\\config.properties");
		prop.load(ip);
		}
		catch (FileNotFoundException e) 
		{
		 e.printStackTrace();	
		}
		catch (IOException e) 
		{
		 e.printStackTrace();	
		}
	}
	
    public static void initialization()
    {
    	browsername = prop.getProperty("browser");
        driverpath = prop.getProperty("driverpath");
      if(browsername.equals("chrome"))
      {
    	  System.setProperty("webdriver.chrome.driver",driverpath);
    	  driver=new ChromeDriver();   
      } 
        else if(browsername.equals("FF"))
        {
    	  System.setProperty("webdriver.gecko.driver",driverpath);
    	  driver=new FirefoxDriver();    
        }
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().pageLoadTimeout(TestUtil.pageloadtimeout,TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(TestUtil.implicitWait,TimeUnit.SECONDS);
      driver.get(prop.getProperty("url"));
      
    }
}

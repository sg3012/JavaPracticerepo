package testseleniumpro;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Testinputautomatefirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckdriver-0.25.0\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions()
				.setLogLevel(Level.OFF);
		WebDriver launchfirefox = new FirefoxDriver(options);
		launchfirefox.manage().window().maximize();
		launchfirefox.manage().deleteAllCookies();
		launchfirefox.get("https://cleartax.in/account/register?ref=navbar_static");
	// 1. Input Using Xpath of the I/P fields: 
		launchfirefox.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("Shubham Gupta");
		launchfirefox.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Test@123");
		launchfirefox.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Test@123");
      
	 /*// 2. Input Using id of the I/P field : 
		launchfirefox.findElement(By.id("UserName")).sendKeys("Shubham Gupta");
		launchfirefox.findElement(By.id("Password")).sendKeys("Test@123");
		launchfirefox.findElement(By.id("ConfirmPassword")).sendKeys("Test@123"); */
		
	/* // 3. Input Using name of the I/P field : 
		launchfirefox.findElement(By.name("UserName")).sendKeys("Shubham Gupta");
		launchfirefox.findElement(By.name("Password")).sendKeys("Test@123");
		launchfirefox.findElement(By.name("ConfirmPassword")).sendKeys("Test@123"); */
		
	/* // 4. Click link using LinkText : 
		launchfirefox.findElement(By.linkText("Login")).click(); */

	/* // 5. Input Using CSSSelector of the I/P field : 
		launchfirefox.findElement(By.cssSelector("#UserName")).sendKeys("Shubham Gupta");
		launchfirefox.findElement(By.cssSelector("#Password")).sendKeys("Shubham Gupta");
		launchfirefox.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("Shubham Gupta"); */ 
		
	/* // 6. Click link using ClassName : 
		launchfirefox.findElement(By.className("ct-btn")).click(); */
	}

}

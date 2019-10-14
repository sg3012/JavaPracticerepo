package testseleniumpro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class Testautomateinputchrome {

 public static void main(String[] args) {
				// TODO Auto-generated method stub

 System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-77.0\\chromedriver.exe");
 WebDriver launchchrome = new ChromeDriver();
 launchchrome.manage().window().maximize();
 launchchrome.manage().deleteAllCookies();
 launchchrome.get("https://cleartax.in/account/register?ref=navbar_static");
 // 1. Input Using Xpath of the I/P fields: 
	launchchrome.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("Shubham Gupta");
	launchchrome.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Test@123");
	launchchrome.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Test@123"); 
  
/*// 2. Input Using id of the I/P field : 
	launchchrome.findElement(By.id("UserName")).sendKeys("Shubham Gupta");
	launchchrome.findElement(By.id("Password")).sendKeys("Test@123");
	launchchrome.findElement(By.id("ConfirmPassword")).sendKeys("Test@123"); */
	
/*// 3. Input Using name of the I/P field : 
   launchchrome.findElement(By.name("UserName")).sendKeys("Shubham Gupta");
   launchchrome.findElement(By.name("Password")).sendKeys("Test@123");
   launchchrome.findElement(By.name("ConfirmPassword")).sendKeys("Test@123");*/
	
/*// 4. Click link using LinkText : 
	launchchrome.findElement(By.linkText("Login")).click(); */

/*// 5. Input Using CSSSelector of the I/P field : 
	launchchrome.findElement(By.cssSelector("#UserName")).sendKeys("Shubham Gupta");
	launchchrome.findElement(By.cssSelector("#Password")).sendKeys("Shubham Gupta");
	launchchrome.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("Shubham Gupta");*/
	
/*// 6. Click link using ClassName : 
	launchchrome.findElement(By.className("ct-btn")).click(); */
	
    }
}
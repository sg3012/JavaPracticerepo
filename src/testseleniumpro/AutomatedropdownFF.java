package testseleniumpro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class AutomatedropdownFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckdriver-0.25.0\\geckodriver.exe");
	WebDriver launchfirefox = new FirefoxDriver();
	launchfirefox.get("https://www.facebook.com");
	
      //1. Handling drop-down using "id" locator. 
         Select obj1 = new Select(launchfirefox.findElement(By.id("month")));
         obj1.selectByVisibleText("Jan"); 
       
	/* //2. Handling drop-down using "name" locator. 
         Select obj1 = new Select(launchfirefox.findElement(By.name("birthday_month")));
         obj1.selectByVisibleText("Feb"); */
	}

}

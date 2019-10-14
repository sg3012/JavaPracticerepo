package testseleniumpro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestloginflowFF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver-0.25.0\\geckodriver.exe");
		WebDriver launchfirefox = new FirefoxDriver();
		launchfirefox.manage().window().maximize();
		launchfirefox.manage().deleteAllCookies();
		launchfirefox.get("https://www.incommail.com/"); 
		launchfirefox.findElement(By.linkText("Log In")).click();
		launchfirefox.findElement(By.id("email")).sendKeys("shubham.gupta@pulpstrategy.com");
		launchfirefox.findElement(By.id("password")).sendKeys("test@123");  
		launchfirefox.findElement(By.cssSelector("form.ng-dirty > button:nth-child(5)")).click();
	}

}

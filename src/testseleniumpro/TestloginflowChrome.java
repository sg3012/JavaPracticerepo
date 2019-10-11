package testseleniumpro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestloginflowChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-77.0\\chromedriver.exe");
		WebDriver launchchrome = new ChromeDriver();
		launchchrome.get("https://www.incommail.com/"); 
		launchchrome.findElement(By.linkText("Log In")).click();
		launchchrome.findElement(By.id("email")).sendKeys("shubham.gupta@pulpstrategy.com");
		launchchrome.findElement(By.id("password")).sendKeys("test@123");
		launchchrome.findElement(By.cssSelector("#Login_pop > div > div > div > div > div > div.col-md-7.er_right > div > form > button")).click();
	    
	} 

}

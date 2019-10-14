package testseleniumpro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestsignupflowhappypathChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-77.0\\chromedriver.exe");
		 WebDriver launchchrome = new ChromeDriver();
		 launchchrome.manage().window().maximize();
		 launchchrome.manage().deleteAllCookies();
		 launchchrome.get("https://www.incommail.com/"); 
		 Thread.sleep(2000);
		 launchchrome.findElement(By.linkText("Sign Up")).click(); 
		 launchchrome.findElement(By.id("emailReg")).sendKeys("automateoct1105@yopmail.com");
		 Thread.sleep(3000);
		 launchchrome.findElement(By.id("passwordReg")).sendKeys("test12345");
		 Thread.sleep(3000);
		 launchchrome.findElement(By.id("confirm_passwordReg")).sendKeys("test12345");
		 Thread.sleep(2000);
		 launchchrome.findElement(By.id("agree")).click();
		 Thread.sleep(2000);
		 launchchrome.findElement(By.cssSelector("#otpsignup > form > button")).click();
	}

}

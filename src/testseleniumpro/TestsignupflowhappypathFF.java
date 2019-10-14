package testseleniumpro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestsignupflowhappypathFF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver-0.25.0\\geckodriver.exe");
		WebDriver launchfirefox = new FirefoxDriver();
		launchfirefox.manage().window().maximize();
		launchfirefox.manage().deleteAllCookies();
		launchfirefox.get("https://www.incommail.com/"); 
		Thread.sleep(2000);
		launchfirefox.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(1000);
		launchfirefox.findElement(By.id("emailReg")).sendKeys("automateoct1106@yopmail.com");
		Thread.sleep(3000);
		launchfirefox.findElement(By.id("passwordReg")).sendKeys("test12345");
		Thread.sleep(3000);
		launchfirefox.findElement(By.id("confirm_passwordReg")).sendKeys("test12345");
		Thread.sleep(2000);
		launchfirefox.findElement(By.id("agree")).click();
		Thread.sleep(2000);
		launchfirefox.findElement(By.cssSelector("#otpsignup > form:nth-child(2) > button:nth-child(5)")).click();
		
	}

}

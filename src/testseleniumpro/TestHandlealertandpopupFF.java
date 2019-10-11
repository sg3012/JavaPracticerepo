package testseleniumpro;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class TestHandlealertandpopupFF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver-0.25.0\\geckodriver.exe");
    WebDriver launchfirefox = new FirefoxDriver();
    launchfirefox.get("https://mail.rediff.com/cgi-bin/login.cgi");
    Thread.sleep(2000);
    launchfirefox.findElement(By.name("proceed")).click();
    Alert alert=launchfirefox.switchTo().alert();
    String text=alert.getText();
    if(text.equals("Please enter a valid user name"))
    	{
    	System.out.println("TEST PASSED-Message on the alert is correct");
        Thread.sleep(2000);
    	}
    else 
    	System.out.println("TEST FAILED-Message on the alert is incorrect");
    Thread.sleep(2000);
    alert.accept(); 
    
	}

}

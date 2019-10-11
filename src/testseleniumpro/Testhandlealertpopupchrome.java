package testseleniumpro;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.By;
import org.openqa.selenium.Alert; 
public class Testhandlealertpopupchrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-77.0\\chromedriver.exe");
    WebDriver launchchrome= new ChromeDriver();
    launchchrome.get("https://mail.rediff.com/cgi-bin/login.cgi");
    Thread.sleep(2000);
    launchchrome.findElement(By.name("proceed")).click();
    Alert alert=launchchrome.switchTo().alert();
    String text=alert.getText();
    if(text.equals("Please enter a valid user name"))
    	{
    	System.out.println("TEST PASSED -- alert text is correct");
        Thread.sleep(2000);
    	}
    else 
        {
    	System.out.println("TEST PASSED -- alert text is correct");
        Thread.sleep(2000);
	    }
    alert.accept();
	}
}

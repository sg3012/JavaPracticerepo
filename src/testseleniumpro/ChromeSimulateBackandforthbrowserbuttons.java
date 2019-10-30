package testseleniumpro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ChromeSimulateBackandforthbrowserbuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-77.0\\chromedriver.exe");
	    WebDriver launchchrome= new ChromeDriver();
	    launchchrome.manage().window().maximize();
		launchchrome.manage().deleteAllCookies(); 
		launchchrome.get("https://www.google.com/");
		Thread.sleep(1500);
		launchchrome.get("https://www.facebook.com/");
	    Thread.sleep(1500);
	    launchchrome.navigate().back();
	    Thread.sleep(1500);
	    launchchrome.navigate().forward();
	    Thread.sleep(1500);
	}

}

package testseleniumpro;
import java.util.logging.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogType;
public class Launchfirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Launch Firefox:
		 
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckdriver-0.25.0\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions()
				.setLogLevel(Level.OFF);
		WebDriver launchfirefox = new FirefoxDriver(options);
		launchfirefox.get("https://www.google.com");
		
		
	}

}

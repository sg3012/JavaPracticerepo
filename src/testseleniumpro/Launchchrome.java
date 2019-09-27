package testseleniumpro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launchchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-76.0\\chromedriver.exe");
		WebDriver launchchrome = new ChromeDriver();
		launchchrome.get("https://www.google.com");
		String t = launchchrome.getTitle(); // get the current page title
		System.out.println("Title: "+t); // print the current page title
		System.out.println(launchchrome.getCurrentUrl()); // get and post current URL.
		// System.out.println(launchchrome.getPageSource()); // get and post current page source.
		launchchrome.quit(); // quit the driver and close the currently opened instance of chrome.
	}

}

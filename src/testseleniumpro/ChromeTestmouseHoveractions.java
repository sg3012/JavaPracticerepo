package testseleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; 
public class ChromeTestmouseHoveractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-77.0\\chromedriver.exe");
	    WebDriver launchchrome= new ChromeDriver();
	    launchchrome.manage().window().maximize();
		launchchrome.manage().deleteAllCookies(); 
		launchchrome.get("https://www.spicejet.com/");
	    Actions mousehover = new Actions(launchchrome); 
	    mousehover.moveToElement(launchchrome.findElement(By.xpath("//span[@class='burger-bread']"))).build().perform();
	    Thread.sleep(2000);
	    mousehover.moveToElement(launchchrome.findElement(By.linkText("Travel Info"))).build().perform();
	    Thread.sleep(2000); 
	    launchchrome.findElement(By.linkText("Carriage of Live Animals")).click();
	}

}

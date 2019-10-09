package testseleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automatedropdownchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-77.0\\chromedriver.exe");
    WebDriver launchchrome = new ChromeDriver();
    launchchrome.get("https://www.facebook.com");
    //1. Handling drop-down using "id" locator. 
    Select obj1 = new Select(launchchrome.findElement(By.id("month")));
    obj1.selectByVisibleText("Jan");  
    
  /* //2. Handling drop-down using "name" locator. 
    Select obj1 = new Select(launchchrome.findElement(By.name("birthday_month")));
    obj1.selectByVisibleText("Feb"); */
    
	}

}

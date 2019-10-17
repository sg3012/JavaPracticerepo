package testseleniumpro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chromecustomizexpathforstaticelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-77.0\\chromedriver.exe");
	WebDriver launchchrome = new ChromeDriver();
	launchchrome.manage().window().maximize();
	launchchrome.manage().deleteAllCookies();
	launchchrome.get("https://ui.freecrm.com/");
    Thread.sleep(2000);
    //1. Customize xpaths for I/P fields (<input> tags)in a form :
      // a) creating xpath directly (without using any function) :    
	     launchchrome.findElement(By.xpath("//input[@name='email']")).sendKeys("sgnight30@gmail.com");
	     Thread.sleep(2000);
	     launchchrome.findElement(By.xpath("//input[@name='password']")).sendKeys("Automatecrm@123");
	     Thread.sleep(2000);
/* //2. Customized xpath for divisions <div> tags in a form: 
	      launchchrome.findElement(By.xpath("//div[text()='Login']")).click(); 
	     
   //3. Customized xpath for Links <a> tags in a form: 
         
        // a) creating xpath using only text() function :
	          launchchrome.findElement(By.xpath("//a[text()='Sign Up']")).click();   
	     
	    // b) creating xpath using text() function and contains() functions combination : 
              launchchrome.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click(); */
	    
	// Creating a new Object of chromedriver to open the below in a new window of chrome:      
	    WebDriver launchchrome2 = new ChromeDriver();
	    launchchrome2.manage().window().maximize();
	 	launchchrome2.manage().deleteAllCookies();
	
	    launchchrome2.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
	    Thread.sleep(2000);
	 /*   1. Creating custom xpath for a dropdown button element : 
	    	a) Case 1 : 
	           launchchrome2.findElement(By.xpath("//div[@class='dropdown']//button[@type='button'and @class='btn btn-secondary dropdown-toggle'and @id='dropdownMenuButton']")).click(); */
	    
	     // b) Case 2:
	           launchchrome2.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
	}

}

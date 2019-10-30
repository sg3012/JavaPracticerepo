package testseleniumpro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By; 
public class Chromecountlinksonwebpage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-77.0\\chromedriver.exe"); 
     WebDriver launchchrome = new ChromeDriver();
     launchchrome.manage().window().maximize();
     launchchrome.manage().deleteAllCookies();
     launchchrome.get("https://cleartax.in/");
     List <WebElement> countlinks = launchchrome.findElements(By.tagName("a"));
	
    //  1. Count the total number of Links on the webpage:
     System.out.println("Number of links on the page: "+countlinks.size());
     
    // 2.  display the texts for those links : 
     for(int i=0; i<countlinks.size();i++)
     {
        String textcount=countlinks.get(i).getText();	
        System.out.println(textcount); 
     }
     
  }
 
}

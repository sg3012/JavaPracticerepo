package testseleniumpro;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeHandlewindowpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-76.0\\chromedriver.exe");
		WebDriver launchchrome = new ChromeDriver();
		launchchrome.manage().window().maximize();
		launchchrome.manage().deleteAllCookies();
		launchchrome.get("http://www.dummysoftware.com/popupdummy_testpage.html");
        launchchrome.findElement(By.name("mouseoverpopup")).click(); 
        Set<String> idset= launchchrome.getWindowHandles();	  
        Iterator<String> idsetiterate = idset.iterator();
        String firstwindowhandle  = idsetiterate.next();
        String secondwindowhandle  =idsetiterate.next();
        System.out.println("Window ID and title of 1st window");
        System.out.println("Window ID: "+firstwindowhandle+"Window title: "+launchchrome.getTitle()); 
        System.out.println("Window ID and title of 2nd window");
        launchchrome.switchTo().window(secondwindowhandle); 
        System.out.println("Window ID: "+secondwindowhandle+"Window title: "+launchchrome.getTitle()); 
        launchchrome.close();

	}

}

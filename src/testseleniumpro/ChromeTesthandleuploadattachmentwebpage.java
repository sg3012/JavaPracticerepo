package testseleniumpro;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.By; 
public class ChromeTesthandleuploadattachmentwebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","D:\\Automation\\ChromeDriver-77.0\\chromedriver.exe");
    WebDriver launchchrome = new ChromeDriver();
    launchchrome.manage().window().maximize();
	launchchrome.manage().deleteAllCookies();
    launchchrome.manage().window().maximize();
    launchchrome.get("https://html.com/input-type-file/");
    launchchrome.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\ShubhamQA\\Downloads\\jobOutput.txt");
	}

}

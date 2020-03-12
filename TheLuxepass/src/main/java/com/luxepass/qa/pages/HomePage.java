package com.luxepass.qa.pages;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luxepass.qa.base.TestBase;
public class HomePage extends TestBase {
    
	// PAGE OBJECT REPO:

	@FindBy(xpath = "//div[@class='menu-1']//ul//li//a[text()='How It Works']")
	WebElement howitworks;

	@FindBy(xpath = "//div[@class='menu-1']//ul[@class='nav navbar-nav navbar-right']//li//a[text()='Browse Hotel']")
	WebElement browseHotel;

	@FindBy(xpath = "//div[@class='menu-1']//ul[@class='nav navbar-nav navbar-right']//li//a[text()='My Orders']")
	WebElement myorders;

	@FindBy(xpath = "//div[@class=\"menu-link\"]//div[@class=\"menu-1\"]"
			+ "//img[starts-with(@src,'https://s3.us-west-2.amazonaws.com/luxepass')]")
	WebElement myprofile;

	@FindBy(xpath = "//li[@class='dropdown open']//ul[@class='dropdown-menu']//a[text()='My Account']")
	WebElement myaccountlink;

	@FindBy(xpath = "//div[@class='row']//div[@class='menu-1']//span[text()='Logout']")
	WebElement logoutlink;

	@FindBy(xpath = "//div[@class='join-us']//button[@class='custom-button input-btn']")
	WebElement locatebtn;

	@FindBy(xpath = "//input[@name='search-hotels' and @placeholder='Search For Hotels']")
	WebElement searchbox;

	@FindBy(xpath = "//div[@class='gtco-icon']//img[@src='assets/images/icon-1.png']")
	WebElement poolfilterimg;

	@FindBy(xpath = "//div[@class='gtco-icon']//img[@src='assets/images/icon-2.png']")
	WebElement gymfilterimg;

	@FindBy(xpath = "//div[@class='gtco-icon']//img[@src='assets/images/icon-3.png']")
	WebElement spasalonfilterimg;

	@FindBy(xpath = "//div[@class='m-prev swiper-button-prev']")
	WebElement prevslidericon;

	@FindBy(xpath = "//div[@class='feature-list hotels-slider swiper-container-initialized "
			+ "swiper-container-horizontal swiper-container-free-mode']")
	WebElement slidercontainerhotel;

	@FindBy(xpath = "//section[@class='about-work additional-feature']")
	WebElement slidercontainerhowitowrks;

	@FindBy(xpath = "//div[@class='m-next active swiper-button-next']")
	WebElement nxtslidericon;

	@FindBy(xpath = "//div[@class='hotel-box on-img']//span[@class='right']//img[@src='assets/images/heart.png']")
	List<WebElement> hearticons;

	@FindBy(xpath = "//section[@id='hotels']//a[@class='btn btn-info' and contains(text(),'Browse More')]")
	WebElement browsemorehotel;

	@FindBy(xpath = "//section[@class='about-work additional-feature']//a[@class='btn btn-info' and contains(text(),'Browse More')]")
	WebElement browsemorehowitworks;

	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button']")
	WebElement aboutusvideobtn;
	@FindBy(xpath = "//input[@class='custom-button input-num ng-untouched ng-pristine ng-invalid' "
			+ "and @formcontrolname='mobile']")
	WebElement smslinkinput;

	@FindBy(xpath = "//input[@class='custom-button input-num ng-untouched ng-pristine ng-invalid' "
			+ "and @formcontrolname='email']")
	WebElement emaillinkinput;

	@FindBy(xpath = "//button[text()='Text App Link']")
	WebElement sendsmsapplinkbtn;

	@FindBy(xpath = "//button[text()='Email App Link']")
	WebElement sendemailapplinkbtn;

	@FindBy(xpath = "//p[text()=' Google Play']")
	WebElement playstorelink;

	@FindBy(xpath = "//p[text()=' App Store']")
	WebElement appstore;

	@FindBy(xpath = "//input[@class='custom-button input-num subscrive ng-untouched ng-pristine ng-invalid']")
	WebElement subscribeemailinput;

	@FindBy(xpath = "//button[text()='Subscribe']")
	WebElement subscribebtn;

	@FindBy(linkText = "FAQ")
	WebElement FAQlnk;

	@FindBy(linkText = "Terms & Conditions")
	WebElement TandClnk;

	@FindBy(linkText = "Privacy Policy")
	WebElement Privacypolicylnk;

	@FindBy(linkText = "Contact Us")
	WebElement ContactUslnk;

	@FindBy(linkText = "Partner With Us")
	WebElement PartnerWithUslnk;

	@FindBy(xpath = "//i[@class='fa fa-instagram']")
	WebElement Instasocial;

	@FindBy(xpath = "//i[@class='fa fa-facebook']")
	WebElement Facebooksocial;
//	@FindBy(xpath="//div[@class='gtco-icon']//img[@src='assets/images/icon-3.png']")
//	WebElement spasalonfilterimg;
	String parent,child; 
	public void scrollintoviewhotel(WebElement slidercontainerhotel, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", slidercontainerhotel);
	}

	public void scrollintoviewhowitworks(WebElement slidercontainerhowitworks, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", slidercontainerhowitworks);
	}

	public void clickslider(WebElement nxtslidericon, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", nxtslidericon);
	}

	public void clickheart(WebElement heartlist, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", heartlist);
	}

	public HomePage() {                                     // For initializing the object of this page. 
		PageFactory.initElements(driver, this);
	}                                              

	public String validateHomePageTitle() {
		return driver.getTitle();

	}
    
	public void clickonHowitworks() {
		howitworks.click();
	}

	public HotelListingPage clickonBrowseHotel() {
		browseHotel.click();
		return new HotelListingPage();
	}

	public MyOrdersPage clickonMyorders() {
		myorders.click();
		return new MyOrdersPage();
	}

	public void clickonMyprofile() {
		myprofile.click();

	}

	public MyProfilepage clickonMyaccount() {
		myaccountlink.click();
		return new MyProfilepage();
	}

	public HotelListingPage clickonBrowsemorehotel() {
		scrollintoviewhotel(slidercontainerhotel, driver);
		browsemorehotel.click();
		return new HotelListingPage();
	}

	public void clickonBrowsemorehowitworks() {
		scrollintoviewhowitworks(slidercontainerhowitowrks, driver);
		browsemorehowitworks.click();
	}

	public HotelListingPage clickonPoolfilter() {
		poolfilterimg.click();
		return new HotelListingPage();
	}

	public HotelListingPage clickonGymfilter() {
		gymfilterimg.click();
		return new HotelListingPage();
	}

	public HotelListingPage clickonSpafilter() {
		spasalonfilterimg.click();
		return new HotelListingPage();
	}

	public void addTofavorites() throws InterruptedException {
		scrollintoviewhotel(slidercontainerhotel, driver);
		for (int i = 0; i < hearticons.size(); i++) {
			// THIS CODE IS TO ADD ALL HOTELS TO FAVOURITE
			if (hearticons.get(i).isDisplayed() == true) {
				System.out.println(hearticons.get(i).isDisplayed());
				clickheart(hearticons.get(i), driver);
				Thread.sleep(1000);
			}

			else {
				System.out.println(hearticons.get(i).isDisplayed());
				// nxtslidericon.click();
				clickslider(nxtslidericon, driver);
				clickheart(hearticons.get(i), driver);
			}

			Thread.sleep(1000);
		}

	}

	public void playaboutusvideo() {
		aboutusvideobtn.click();
	}

	public void sendsmsapplink(String phone) {
		smslinkinput.sendKeys(phone);
		sendsmsapplinkbtn.click();
	}

	public void sendemailapplink(String email) {
		emaillinkinput.sendKeys(email);
		sendemailapplinkbtn.click();
	}

	public String clickgoogleplay() {
		parent = driver.getWindowHandle(); 
		playstorelink.click();
		Set<String>allhandles=driver.getWindowHandles();	  
        Iterator<String> it = allhandles.iterator();
        while(it.hasNext()==true)
        {
        	child = it.next();
        	if(!parent.equalsIgnoreCase(child))
        	{
        		//System.out.println("CHILD WINDOW ID: " +child);
        		driver.switchTo().window(child);
        	}
        }
        return driver.getTitle();
	}

	public String clickappstore() {
		parent = driver.getWindowHandle();
		appstore.click();
		Set<String>allhandles=driver.getWindowHandles();	  
        Iterator<String> it = allhandles.iterator();
        while(it.hasNext()==true)
        {
        	child = it.next();
        	if(!parent.equalsIgnoreCase(child))
        	{
        		//System.out.println("CHILD WINDOW ID: " +child);
        		driver.switchTo().window(child);
        	}
        }
        return driver.getTitle();
	}

	public void sendsubscriptionemail(String email)

	{
		subscribeemailinput.sendKeys(email);
		subscribebtn.click();
	}

	public FAQ clickFAQlink()

	{
		FAQlnk.click();
		return new FAQ();
	}

	public ContactUs clickContactuslink()

	{
		ContactUslnk.click();
		return new ContactUs();
	}

	public PartnerwithUs clickPartnerwithuslink()

	{
		PartnerWithUslnk.click();
		return new PartnerwithUs();
	}

	public void clickTandClink()

	{
		TandClnk.click();

	}

	public void clickPrivacypolicylink()

	{
		Privacypolicylnk.click();

	}

	public void clickInstasociallink()

	{
		Instasocial.click();

	}

	public void clickFBsociallink()

	{
		Facebooksocial.click();

	}

}

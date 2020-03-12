package com.luxepass.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luxepass.qa.base.TestBase;
import com.luxepass.qa.pages.ContactUs;
import com.luxepass.qa.pages.FAQ;
import com.luxepass.qa.pages.HomePage;
import com.luxepass.qa.pages.HotelListingPage;
import com.luxepass.qa.pages.LoginPage;
import com.luxepass.qa.pages.MyOrdersPage;
import com.luxepass.qa.pages.MyProfilepage;
import com.luxepass.qa.pages.PartnerwithUs;

public class HomePageflowtest extends TestBase {
	LoginPage loginpage; 
	HomePage homepage;
	HotelListingPage hotelisting;
	MyOrdersPage myorders;
	MyProfilepage myprofile;
	FAQ faq;
	ContactUs contactus;
	PartnerwithUs partnerwithus;

	public HomePageflowtest() {
		super(); /*
					 * 1. This statement will call the super/base class(TestBase) constructor and
					 * load the properties file in this class. 2. This statement is mandatory to be
					 * used if u are designing your framework using properties file. 3. This is done
					 * to avoid the nullpointerException when the initialization() method is called
					 * to initialize and use the properties from the properties file.
					 */
	}

	@BeforeMethod /* 1. Will be executed before the execution of each @Test annotation */
	public void setUp() throws InterruptedException {
		initialization(); /*
							 * As the name indicates this method will create the initial setup of the
							 * following things : -- Sets up the driver for the required browser.
							 */

		/*loginpage = new LoginPage(); 
										 * Created a LoginPage Class Object and will call it's constructor which will
										 * eventually initialize the Object
										 */
		homepage = loginpage.login(prop.getProperty("email"), prop.getProperty(
				"password")); /*
								 * With this statement the home page reference variable will eventually point to
								 * the home page object as login() method returns the Homepage object
								 */
	}

	@Test(priority = 1)
	public void homepageTitletest() {
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals(title, "The LuxePass");
	}

	@Test(priority = 2)
	public void howitworkstest() throws InterruptedException {
		homepage.clickonHowitworks();
		Thread.sleep(1500);
	}

	@Test(priority = 3)
	public void browsehoteltest() throws InterruptedException {
		hotelisting = homepage.clickonBrowseHotel();
		Thread.sleep(1500);
	}

	@Test(priority = 4)
	public void myOrderstest() throws InterruptedException {
		myorders = homepage.clickonMyorders();
		Thread.sleep(1500);
	}

	@Test(priority = 5)
	public void myprofileicontest() throws InterruptedException {
		homepage.clickonMyprofile();
		Thread.sleep(1500);
	}

	@Test(priority = 6)
	public void myaccounttest() throws InterruptedException {
		myprofile = homepage.clickonMyaccount();
		Thread.sleep(1500);
	}

	@Test(priority = 7)
	public void poolfiltertest() throws InterruptedException {
		hotelisting = homepage.clickonPoolfilter();
		Thread.sleep(1500);
	}

	@Test(priority = 8)
	public void gymfiltertest() throws InterruptedException {
		hotelisting = homepage.clickonGymfilter();
		Thread.sleep(1500);
	}

	@Test(priority = 9)
	public void spasalonfiltertest() throws InterruptedException {
		hotelisting = homepage.clickonSpafilter();
		Thread.sleep(1500);
	}

	@Test(priority = 10)
	public void addtofavoritestest() throws InterruptedException {
		homepage.addTofavorites();
	}

	@Test(priority = 11)
	public void browsemorehoteltest() throws InterruptedException {
		hotelisting = homepage.clickonBrowsemorehotel();
		Thread.sleep(1500);
	}

	@Test(priority = 12)
	public void aboutusvideotest() throws InterruptedException {
		homepage.playaboutusvideo();
		Thread.sleep(1500);
	}

	@Test(priority = 13)
	public void browsemorehowitworkstest() throws InterruptedException {
		homepage.clickonBrowsemorehowitworks();
		Thread.sleep(1500);
	}

	@Test(priority = 14)
	public void sendsmsapplinktest() throws InterruptedException {
		homepage.sendsmsapplink(prop.getProperty("phone"));
	}

	@Test(priority = 15)
	public void sendemailpplinktest() throws InterruptedException {
		homepage.sendemailapplink(prop.getProperty("email"));
	}

	@Test(priority = 16)
	public void playstoredownloadtest() throws InterruptedException {
		homepage.clickgoogleplay();
	}

	@Test(priority = 17)
	public void appstoredownloadtest() throws InterruptedException {
		homepage.clickappstore();
	}

	@Test(priority = 18)
	public void sendsubscribeemailtest() throws InterruptedException {
		homepage.sendsubscriptionemail(prop.getProperty("email"));
	}

	@Test(priority = 19)
	public void navigatefooterFAQtest() throws InterruptedException {
		faq = homepage.clickFAQlink();
		Thread.sleep(1500);
	}

	@Test(priority = 20)
	public void navigatefooterTandctest() throws InterruptedException {
		homepage.clickTandClink();
		Thread.sleep(1500);
	}

	@Test(priority = 21)
	public void navigatefooterPrivacypolicytest() throws InterruptedException {
		homepage.clickPrivacypolicylink();
		Thread.sleep(1500);
	}

	@Test(priority = 22)
	public void navigatefooterContactustest() throws InterruptedException {
		contactus = homepage.clickContactuslink();
		Thread.sleep(1500);
	}

	@Test(priority = 23)
	public void navigatefooterPartnerwithustest() throws InterruptedException {
		partnerwithus = homepage.clickPartnerwithuslink();
		Thread.sleep(1500);
	}

	@Test(priority = 24)
	public void navigateInstasocialpagetest() throws InterruptedException {
		homepage.clickInstasociallink();
		Thread.sleep(1500);
	}

	@Test(priority = 25)
	public void navigateFBsocialpagetest() throws InterruptedException {
		homepage.clickFBsociallink();
		Thread.sleep(1500);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

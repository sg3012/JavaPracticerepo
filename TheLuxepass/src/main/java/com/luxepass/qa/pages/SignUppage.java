package com.luxepass.qa.pages;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.*;
import javax.activation.*;
import javax.mail.Folder;
import javax.mail.internet.*;
import javax.mail.search.FlagTerm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.luxepass.qa.base.TestBase;
import com.luxepass.qa.util.TestUtil;

public class SignUppage extends TestBase {

	// PAGE OBJECT REPO :
	String OTP = null;
	String result = null;
	String text = null;
	String html = null;
	@FindBy(xpath = "//span[contains(text(), 'Login / Signup')]")
	WebElement loginsignupbtn;

	@FindBy(xpath = "//span[@class='click-login' and text()='Signup']")
	WebElement signuplink;

	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstnameinput;

	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastnameinput;

	@FindBy(xpath = "//div[@class='control ']//input[@name='email']")
	WebElement emailinput;

	@FindBy(xpath = "//div[@class='show_pass_login']//parent::div[@class='control']//child::input[@name='password']")
	WebElement enterpasswordinput;

	@FindBy(xpath = "//div[@class='show_pass_login']//parent::div[@class='control']//child::input[@name='confirmpassword']")
	WebElement enterconfirmpasswordinput;

	@FindBy(xpath = "//label[@for='box-1']")
	WebElement tandccheckbox;

	@FindBy(xpath = "//button[@type='submit' and text()='Signup']")
	WebElement signupbtn;

	@FindBy(xpath = "//label[text()='I agree to ']//a[text()='Terms & Conditions']")
	WebElement tanclink;

	@FindBy(xpath = "//a[text()='Verify Email']")
	WebElement verifyemaillink;

	@FindBy(xpath = "//h2[text()='Verify Account']//parent::div[@class='login-heading']//following-sibling::form[contains(@class,'pop-num-form')]//div[contains(@class,'verify-btn')]//preceding-sibling::div[contains(@class,'float-label')]//div[@class='control']//input[@name='email']")
	WebElement nonactiveemail;

	@FindBy(xpath = "//h2[text()='Verify Account']//parent::div[@class='login-heading']//following-sibling::form[contains(@class,'pop-num-form')]//div[@class='control']//input[@formcontrolname='otp']")
	WebElement otpinput;
	
	@FindBy(xpath = "//h2[text()='Verify Account']//parent::div[@class='login-heading']//following-sibling::form[contains(@class,'pop-num-form')]//div[contains(@class,'verify-btn')]//button[contains(text(),'Submit')]")
	WebElement verifyaccountsubmitbtn;
	@FindBy(xpath = "//a[text()='Resend code']")
	WebElement resendcodelink;

	@FindBy(xpath = "//h2[text()='Verify Account']//parent::div[@class='login-heading']//following-sibling::form[contains(@class,'pop-num-form')]//div[contains(@class,'verify-btn')]//button[contains(text(),'Verify')]")
	WebElement verifybtn;

	@FindBy(xpath = "//div[@id='signUp']//div[@class='er_pop_wrapper']//p[@class='closed']")
	WebElement crossicon;

	@FindBy(xpath = "//span[text()='Login' and @class='click-login']")
	WebElement loginlink;

	public void clickTandC_Checkbox(WebElement e, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
	}

	public void clickverifybutton(WebElement e, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", e);
	}

	public SignUppage() { // For initializing the object of this page.
		PageFactory.initElements(driver, this);
	}

	public void clickcrossicon() {
		crossicon.click();
	}

	public void clickverifyemaillink() {
		verifyemaillink.click();
	}

	public void clicktandclink() {
		tanclink.click();
	}

	public LoginPage signup(String firstname, String lastname, String email, String password, String confirmpassword)
//	public HomePage signup()
			throws InterruptedException {

		BodyPart plaintextpart = null;
		BodyPart htmlpart = null;
		loginsignupbtn.click();
		signuplink.click();
//		firstnameinput.sendKeys(firstname);
//		lastnameinput.sendKeys(lastname);
//		emailinput.sendKeys(email);
//		enterpasswordinput.sendKeys(password);
//		enterconfirmpasswordinput.sendKeys(confirmpassword);
//
//		clickTandC_Checkbox(tandccheckbox, driver);
//		Thread.sleep(1000);
//		signupbtn.click();
		verifyemaillink.click(); 
		nonactiveemail.sendKeys(prop.getProperty("Email"));
		verifyaccountsubmitbtn.click();
//		Thread.sleep(240000);
	    wait = new WebDriverWait(driver, TestUtil.implicitWait);
		verifybtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//h2[text()='Verify Account']//parent::div[@class='login-heading']//following-sibling::form[@class='pop-num-form ng-untouched ng-pristine ng-invalid']//button[text()='Verify']")));
		// TODO Auto-generated method stub

		// Creating properties class object and Initializing all the properties for
		// receiving mail :
		Properties props = new Properties();
		props.put("mail.imap.auth", "true"); // Indicates whether the SMPT host or mail sever takes email and
												// password authentication or not.
		props.put("mail.imap.host", "imap.gmail.com"); // host name for the gmail SMTP server.
		props.put("mail.imap.port", "993"); // smtp port for gmail smtp server
		props.put("mail.store.protocol", "imaps"); // defines socketFactory port
		props.put("mail.transport.protocol", "imaps"); // defines socketFactory class
		props.put("mail.imap.starttls.enable", "true");
		// Creating sessions class Object :

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(prop.getProperty("username"), prop.getProperty("passphrase"));
			}
		});

		try {
			// Creating store class object :
			Store store = session.getStore("imaps");

			// Connect to the imap server :
			store.connect("imap.gmail.com", prop.getProperty("username"), prop.getProperty("passphrase"));

			// Create Folder class object of type "INBOX" :
			Folder folder = store.getFolder("Inbox");

			// Open the folder in Read Only mode :
			folder.open(Folder.READ_WRITE);

			// Retrieve the Unseen messages in an array of type Message :
			 Flags seen = new Flags(Flags.Flag.SEEN);
			 FlagTerm unseenFlagTerm = new FlagTerm(seen, false);
			 Message[] unreadmessages = folder.search(unseenFlagTerm);
   
			System.out.println("Flags Supported by the folder: " + folder.getPermanentFlags());
//			System.out.println("Flags Supported by the system: " + flag.getSystemFlags().toString());
			int unreadmsgcount = unreadmessages.length; 
			int temp = unreadmsgcount; 
			System.out.println("INITIAL UNSEEN messages in Inbox: " + unreadmsgcount);
			
			while(unreadmsgcount==temp)
			 {	folder.close();                        /* These  2 steps are done 
			                                            to refresh count of messages in the folder*/
			    folder.open(Folder.READ_WRITE); 
				unreadmessages = folder.search(unseenFlagTerm);
				unreadmsgcount = unreadmessages.length;
			 }  
			System.out.println("Total UNSEEN in Inbox: " + unreadmsgcount);

			// Traverse the array and print all the messages :
			if (unreadmsgcount > 0) {
				for (int i = unreadmsgcount - 1; i > (unreadmsgcount - 3); i--) {
					// Create a separate message for each message in the messages[] array above :
					Message message = unreadmessages[i];
					System.out.println("Flags supported by this message: " + message.getFlags());
					// Printing the msg subject, number, Sender :
					System.out.println("------------------------------");
					System.out.println("Email number: " + (i + 1));
					System.out.println("Sender:" + message.getFrom()[0]);
					System.out.println("Subject: " + message.getSubject());
//						System.out.println("Content: " + message.getContent().toString());

					System.out.println("Date: " + message.getReceivedDate());
					System.out.println("Reply-to: " + message.getReplyTo()[0].toString());

					while (text == null) {
						if (message instanceof MimeMessage && message.getSubject().equals("Verify your account")
								&& message.getReplyTo()[0].toString()
										.equals("The LuxePass <customersupport@theluxepass.com>")) {
							MimeMessage m = (MimeMessage) message;
							Object o = m.getContent();
							if (o instanceof Multipart) {
								System.out.println("------MULIPARTS INVLOVED-----------------------");
								Multipart mp = (Multipart) o;
								int mpcount = mp.getCount();
								System.out.println("MULTIPARTS COUNT: " + mpcount);
								for (int j = 0; j < mpcount; j++) {
									BodyPart bp = mp.getBodyPart(j); // Storing the bodypart content at index "j" of a
																		// multipart inside
																		// Bodypart reference variable.

									if (bp.isMimeType("text/html")) { // Checking if the concerned BODYPART MimeType is
																		// HTML or not
										System.out.println("HTML PART: ");
										System.out.println("Content at BodyPart: " + j);
										htmlpart = bp;
										html = (String) htmlpart.getContent();
										System.out.println("HTML PART CONVERTED TO TEXT: " + html);

									} else if (bp.isMimeType("text/plain")) { // Checking if the concerned BODYPART
																				// MimeType is PLAIN TEXT or not
										System.out.println("PLAIN TEXT PART: ");
										System.out.println("Content at BodyPart: " + j);
										plaintextpart = bp;
										text = (String) plaintextpart.getContent();
										System.out.println("TEXT PART: " + text);
									}

									else if (o instanceof String) // If the content of the message is a simple text
																	// message.
									{
										result = (String) o;
									}
								}

							}
							Pattern pattern = Pattern.compile("[0-9]+");
							Matcher matcher = pattern.matcher(text);
							while (matcher.find() == true) {
								OTP = matcher.group();
							}
						}

						else {
							System.out.println("-----------DESIRED SUBJECT NOT FOUND ----------------------------");
						}
						break;
					}
				}
			} else {
				System.out.println("MESSAGE WITH NEW FLAG NOT FOUND");
			}

			System.out.println("OTP: " + OTP);
			folder.close();
			store.close();
		}

		catch (NoSuchProviderException e) {
			e.printStackTrace();
		}

		catch (MessagingException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	System.out.println("Verify button visibility: "+verifybtn.isDisplayed());
	     otpinput.sendKeys(OTP);
		 clickverifybutton(verifybtn, driver);
		return new LoginPage();

	}
}

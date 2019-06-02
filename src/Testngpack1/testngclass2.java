	package Testngpack1;
	
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
	
	public class testngclass2 {
	  
		@BeforeSuite
	    public void InitializeSelenium() 
		      {
				  System.out.println("----------------INITIALIZING SELENIUM------------------------");
			
			  }
		@AfterSuite
	    public void CloseSelenium() 
		      {
				  System.out.println("----------------CLOSING SELENIUM------------------------");
			  }
		@BeforeMethod
    public void openbrowser1() 
	      {
			  System.out.println("----------------OPENING BROWSER 1 FOR TESTCASE1 AND TEST CASE2------------------------");
		  }	
	@Test
	  public void testlogin() {
		  System.out.println("----------------TESTING LOGIN------------------------");
	  } 
	  
	@AfterMethod
    public void closebrowser1() 
	      {
			  System.out.println("----------------CLOSING BROWSER 1 FOR TESTCASE1 AND TEST CASE2------------------------");
		  }	
	@BeforeMethod
    public void openbrowser2() 
	      {
			  System.out.println("----------------OPENING BROWSER 2 FOR TESTCASE1 AND TEST CASE2------------------------");
		  }	
	
	  
	  @Test
	  public void testlogout() {
		  System.out.println("----------------TESTING LOGOUT------------------------");
	  }
	  
	  @AfterMethod
	    public void closebrowser2() 
		      {
				  System.out.println("----------------CLOSING BROWSER 2 FOR TESTCASE1 AND TEST CASE2------------------------");
			  }
	  @BeforeTest
	  public void intitaldeclaration ()
	    {
	    	System.out.println("-------------------TESTNGCLASS2 JAVA FILE--------------------------------");
		  System.out.println("----------------Establishing DB connection------------------------");
	    }
	  
	  
	  
	  @AfterTest
	  public void closeDBconnection() {
		  System.out.println("----------------Closing DB connection------------------------");
	  }
	
	}

package Testngpack1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngclass3 {
    @BeforeTest
    public void intitaldeclaration ()
    {
    	System.out.println("-------------------TESTNGCLASS3 JAVA FILE--------------------------------");
    }
	@BeforeMethod
    public void openbrowser1() 
	      {
			  System.out.println("----------------OPENING BROWSER1 FOR TESTCASE3 AND TEST CASE 4------------------------");
		  }	
	@Test
	  public void testcase3() {
		  System.out.println("----------------EXECUTING testcase3------------------------");
	  } 
	  
	@AfterMethod
    public void closebrowser1() 
	      {
			  System.out.println("----------------CLOSING BROWSER 1 FOR TESTCASE3 FOR TESTCASE3 AND TEST CASE 4------------------------");
		  }	
	@BeforeMethod
    public void openbrowser2() 
	      {
			  System.out.println("----------------OPENING BROWSER 2 FOR TESTCASE3 AND TEST CASE 4------------------------");
		  }	
	
	  
	  @Test
	  public void testcase4() {
		  System.out.println("----------------EXECUTING testcase4------------------------");
	  }
	  
	  @AfterMethod
	    public void closebrowser2() 
		      {
				  System.out.println("----------------CLOSING BROWSER 2 FOR TESTCASE3 AND TEST CASE 4------------------------");
			  }
}

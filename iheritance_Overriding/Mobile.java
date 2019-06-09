/**
 * 
 */
package iheritance_Overriding;

/**
 * @author Shubham
 *
 */

public class Mobile {            /*Parent class mobile*/  
public void calling ()          // Overridden Method "calling" in parent class Mobile
{System.out.println("Parent class Overriden calling function");
}

public void sendSMS () 
{System.out.println("Parent class send SMS fucntion"); 
}

public void redial () 
{System.out.println("Parent class redial");

}

public void accessspecifiertest () 
{
System.out.println("Accessmodifiertest function of the parent class with PUBLIC access");	
}
protected void accessspecifiertest2 () 
{
System.out.println("Accessmodifiertest2 function of the parent class with PROTECTED access");	

}

private void test1()
{
System.out.println("Test1() method delared with Private access specifier in parent class");
}

static void test2()
{
System.out.println("Test2() method delared as static in parent class");
}
 

}

package iheritance_Overriding;

public class Samsung extends Mobile{        // Child class Samsung

	public void calling ()   // Overriding Method "calling" in Child class Samsung 
	{
		System.out.println("Child class Overriding calling function");
	}	

	public void Numbertracking () 
	{System.out.println("Number tracking for Samsung class");
	}
	
	/*
	  protected void accessspecifiertest ()                                                 
	{
	System.out.println("Accessmodifiertest function of the parent class with PUBLIC access");	
	}     THIS OVERRIDING FUNCTION FROM THE CHILD CLASS COULDN'T BE 
	      DEFINED WITH AN ACCESS SPECIFIER (Protected here) THAT IS MORE RESTRICTIVE 
	      THAN THE ACCESS SPECIFIER USED FOR THE OVERRIDEN FUNCTION IN THE PARENT CLASS
	      AS PROTECTIVE IS MORE RESTRICTIVE THAN PUBLIC
	
	*/
	
	public void accessspecifiertest2 () /*THIS OVERRIDING FUNCTION FROM THE CHILD CLASS COULD BE 
                                        DEFINED WITH AN ACCESS SPECIFIER (Public here) THAT IS LESS RESTRICTIVE 
                                        THAN THE ACCESS SPECIFIER USED FOR THE OVERRIDEN FUNCTION IN THE PARENT CLASS
                                        AS PUBLIC IS LESS RESTRICTIVE THAN PROTECTED*/
	{
	
    System.out.println("Accessmodifiertest2 function of the parent class with PROTECTED access");	
    
	}
    
	/* @Override
	private void test1()     WE COULDN'T OVERRIDE A METHOD IN THE CHILD CLASS THAT IS DECLARED AS private IN THE
	                         PARENT CLASS AND IF WE TRY TO DO SO THE JVM WILL PRODUCE AN ERROR. HOWEVER, 
	                         WE COULD DECLARE THE DUPLICATE METHOD IN THE CHILD CLASS BUT IN THIS
	                         CASE THE 2 METHODS IN PARENT AS WELL AS CHILD WILL BEHAVE AS 2 SEPARATE METHHODS.   
	{
	System.out.println("Same Test1() method delared with Private access specifier in child class");
	}  */ 
	
	
	/*@Override
	static void test2()  WE COULDN'T OVERRIDE A METHOD IN THE CHILD CLASS THAT IS DECLARED AS Static IN THE
                         PARENT CLASS AND IF WE TRY TO DO SO THE JVM WILL PRODUCE AN ERROR. HOWEVER, 
                         WE COULD DECLARE THE DUPLICATE METHOD IN THE CHILD CLASS BUT IN THIS
                         CASE THE 2 METHODS IN PARENT AS WELL AS CHILD WILL BEHAVE AS 2 SEPARATE METHHODS.
	                  
	{
	System.out.println("Same Test2() method delared as static in child class");
	} */


}

package Oopsconcept;

public class testoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Samsung o1 = new Samsung();
		o1.calling();            /* Calling method called through the object reference of child class pointing to the child
		                            class object and overriding has been implemented*/
		o1.Numbertracking();     /* child class Object reference pointing to the child class Object has access to : 
		                        -- All child functions that are defined in the child class itself. 
	                            -- Overriding function from the parent class 
	                            -- All parent class functions that are defined in the parent class itself (apart from Overridden functions). 
	                                 */
       o1.sendSMS();
       
       Mobile o2 = new Mobile();
        o2.redial();                /* Parent class Object reference pointing to the parent class Object has access to : 
                                      -- Overridden function of parent class itself.  
                                      -- All parent class functions that are defined in the parent class itself 
                                         (apart from Overridden functions). 
                                   */
       o2.calling();
    
    // o2.Numbertracking();   /* The methods belonging to child class only (Numbertracking() here) and all it's properties are not accessible by the Object reference of the parent class*/ 
       
     
   //RUN TIME POLYMORPHISM IMPLEMENTED   
     
     System.out.println("**************RUN TIME POLYMORPHISM ***********");  
     Mobile o3 = new Samsung();
     o3.accessspecifiertest();    /*In run time polymorphism  the object reference of the parent class  can call the following methods : 
                                  --->  overriding methods of child class 
                                  ----> all the non-overridden methods of base class 
                                  ----> cannot call the  methods which are newly declared in the child class and   
                                        Overridden methods of the parent class. */ 
     o3.calling();
     o3.redial();
     o3.sendSMS();
     //o3.Numbertracking();
       
	}
}

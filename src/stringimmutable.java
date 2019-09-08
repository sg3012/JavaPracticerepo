
public class stringimmutable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Selenium"; /* String reference variables S1 and S2 from line 7 and 9 will now point to the common 
		                           memory location in the method area of the String constant pool */ 
		String s2 = "Selenium";
		
		//String s3 = "Automation"; 
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);
		s2="c++";                      /*Now, after writing the statement in line 14 
		                                 compiler will create a new string Object with value "c++" 
		                                 in the string constant pool of the method area at new location without changing 
		                                 the value at the location to which the reference s1 is pointing to. 
		                                 So, Now, both the references are pointing to the different locations 
		                                 in the constant pool. There we say that Strings are immutable as the values 
		                                 at a location in the constant pool don't change*/ 
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);
		
	}

}

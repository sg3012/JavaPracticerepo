package Palindrome;
import java.io.*; 
public class usingonlywhileloop {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String refstring, temp;
		int num, rem, num1,i=0; 
		   System.out.println("Enter the number: ");
	       BufferedReader pl = new BufferedReader(new InputStreamReader (System.in));
	       refstring = pl.readLine(); 
	       num = Integer.parseInt(refstring);
	       temp=""; 
	    while (i<refstring.length())
	         {
	           rem = num%10; 
	    	   temp = temp+rem; 
	    	   num = num/10;
	    	   i++;
	         }
	       num = Integer.parseInt(refstring);
	       num1 = Integer.parseInt(temp);	      
	    	 
	     if(num1==num)
	     System.out.println(num +" "+"is a palindrome number");
	     else 
	     System.out.println(num +" "+"is not a palindrome number");      		
	}

}

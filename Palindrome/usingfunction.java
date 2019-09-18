package Palindrome;
import java.io.*;
public class usingfunction {
	String refstring, temp="";
	int num, rem, num1,i=0; 
	public void palindrome (int number)
	{
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

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		usingfunction p1 = new usingfunction();
		System.out.println("Enter the number: "); 
		BufferedReader p2 = new BufferedReader(new InputStreamReader (System.in));
	     p1.refstring = p2.readLine(); 
	     p1.num = Integer.parseInt(p1.refstring);
		p1.palindrome(p1.num); 
       		
		
	}

}

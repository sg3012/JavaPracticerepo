package Palindrome;
import java.io.*;
public class usingonlyforloop {
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
	String refstring, temp;
	int num, rem, num1; 
	   System.out.println("Enter the number: ");
       BufferedReader pl = new BufferedReader(new InputStreamReader (System.in));
       refstring = pl.readLine(); 
       num = Integer.parseInt(refstring);
       temp=""; 
       for (int i =0; i<refstring.length();i++)
       {
    	   rem = num%10; 
    	   num = num/10; 
    	   temp = temp+rem; 
       }
       num = Integer.parseInt(refstring);
       num1 = Integer.parseInt(temp);
      if(num1==num)
      System.out.println(num +" "+"is a palindrome number");
      else 
      System.out.println(num +" "+"is not a palindrome number");  
	}

}

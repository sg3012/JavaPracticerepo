
// Program to Print ASCII values for all the chracters in ASCII table 
import java.util.Scanner;
public class ASCIIprint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the ASCII characters set "); 
		int n = sc.nextInt();
		char a[] = new char[n];
		int ascii[]=new int[n]; 
		char temp;
		int i,j; 
		System.out.println("Entered size of the character set is: "+ a.length);
		System.out.println("Enter the characters for which you want the ASCII values " );
		for (i =0; i<a.length;i++)
		{
	    a[i]=sc.next().charAt(0);
	    ascii[i]=a[i];
	    }
        
		for (j =0;j<a.length;j++)
		{   System.out.println("ASCII value of " +a[j]+ " is : ");
			System.out.println(ascii[j]); 
	    }

	}
}
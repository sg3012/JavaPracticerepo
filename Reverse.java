import java.util.Scanner;

/**
 * 
 */

/**
 * @author Shubham
 *
 */
public class Reverse {

	public static void main(String[] args) {
		int num, r;
		Scanner a = new Scanner ( System.in);
		System.out.print("Enter the number : ");
		num = a.nextInt(); 
		System.out.println("Reverse : "); 
		while (num>0)
		{ r = num%10; 
		System.out.print(r);
		  num=num/10;
		}
	}

}

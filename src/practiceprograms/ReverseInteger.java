package src.practiceprograms;

import java.util.Scanner;

public class ReverseInteger {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("Enter a number of your choice:");
		
		long num = scan.nextLong();
		
		scan.close();
		
		long rev = 0;
		
		while(num!=0) {
			
			rev = rev * 10 + num % 10;
			num = num/10;
		}
		
		System.out.println("Reverse number:"+rev);
		
	}

}

import java.util.Scanner;
public class infinteloop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	System.out.println("enter a sentence");
    String S,S2,S3;
    //S= "Geeks"; 
    //S2 = "For"; 
    //S3= "Geeks"; 
    Scanner scanner = new Scanner(System.in);
    
    S= scanner.next();
    S2=scanner.next();
    S3=scanner.next();
    //S2=scanner.nextLine();
    //S3=scanner.nextLine();
    // print the next line 
    System.out.println("First line" +S); 

    // print the next line again 
    System.out.println("Second line"+S2); 

    // print the next line again 
    System.out.println("Third line"+S3); 

    scanner.close();
    //scanner2.close();
    //scanner3.close();
    }	
}
package src.applitoolscourse.loops;
import java.util.Scanner;
/**
 * LOOP BREAK
 * Search a string to determin if it contains the letter "A" or "a" with the help of loop
 * If the letter is found then break from the loop.
 */

public class LetterSearch {
     public static void main(String args[]){
         // Get the user input for Unkown value(String)
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the string:");
            String text = scan.next();
            scan.close();
            boolean letterFound= false;

         // Loop through string to search letter "A" or "a"
          for(int i=0;i<text.length();i++){
              char currentLetter = text.charAt(i);
              if(currentLetter=='A' || currentLetter=='a'){
                  letterFound = true;
                  break;
              }
          }
        if(letterFound){
          System.out.println("The text contains letter 'A'");    
        }
        else{
            System.out.println("The text does not contain letter 'A'");
        }
     }    
}

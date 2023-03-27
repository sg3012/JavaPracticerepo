package src.practiceprograms;
import java.util.Scanner;

// Write a program to check whether the input character is an alphabet.
// For e.g. : A or a is an alphabet
// but $,%,&,7,8 are not alphabets. 


public class CheckAlphabet {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){

        System.out.println("Enter a character of your choice: ");

        char ch;

        // Below line shows how we can input a single character from user input
        // in JAVA.

        ch = scan.next().charAt(0);

        // System.out.println("ASCII value: "+ (int)ch);

        int i,j;

        boolean flag = false;

        for(i = 65; i<=90 ; i++){

            if((int)ch == i){

                flag = true;

                break;
            }
        }

        if(i > 90){

            for(j = 97; j<=122 ; j++){

                if((int)ch == j){
    
                    flag = true;
    
                    break;
                }
            }
        }
       

        if(flag){

            System.out.println(ch + " is an alphabet with ASCII value: "+ (int)ch);
        }

        else{

            System.out.println(ch + " is not an alphabet");
        }

        scan.close();
    }
}

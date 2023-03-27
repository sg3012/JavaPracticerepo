package hackerRankpracticechallenges.problems.src.stringQuestions;
import java.util.Scanner;

public class StringLengthPractice {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){

        String s = scan.nextLine();

        scan.close();

        System.out.println("Length of entered string: "+s.length());
    }
    
}

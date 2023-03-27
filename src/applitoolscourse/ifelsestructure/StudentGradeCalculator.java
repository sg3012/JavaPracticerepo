package src.applitoolscourse.ifelsestructure;
import java.util.Scanner;
/**
 * IF-ELSE-IF
 * This class will take the student score in an exam as input
 * Based on the score it will calculate the grades for the student
 */
public class StudentGradeCalculator {
    public static void main(String args[]){
        
        // Get the test score from user input
        System.out.println("What is your test score?:");
        Scanner scan = new Scanner(System.in);
        double score=scan.nextDouble();
        scan.close();

        // Determine the letter grade
        char grade;
        // logic 1:
        // if(score>=50&&score<60){
        //   grade='E';
        // }
        // else if(score>=60&&score<70){
        //     grade='D';
        // }
        // else if(score>=70&&score<80){
        //     grade='C';
        // }
        // else if(score>=80&&score<90){
        //     grade='B';
        // }
        // else if(score>=90){
        //     grade='A';
        // }
        // else{
        //     grade='F';
        // }

        // logic 2
        if(score<60){
            grade='F';
        }
        else if(score<70)
        {
            grade='D';
        }
        else if(score<80){
            grade='C';
        }
        else if(score<90){
            grade='B';
        }
        else{
            grade='A';
        } 
        System.out.println("Your grade is "+grade);
    }
}

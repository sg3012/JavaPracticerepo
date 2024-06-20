package src.applitoolscourse.loops;
import java.util.Scanner;
/**
 * NESTED LOOPS
 * Find the average test scores for each student in the class
 * There are 24 students in the class and each student has 4 tests.
 */

public class AverageTestScores {

    public static void main(String args[]){
          // Initialize the known values
          int numberOfStudents = 24;
          int numberOfTests = 4;
          Scanner scan = new Scanner(System.in);

          // Loop over all the students
           for(int i=0;i<numberOfStudents;i++){
               System.out.println("Student["+(i+1)+"]");
               double total=0;
               for(int j=0;j<numberOfTests;j++){
                System.out.println("Enter the score for test # "+(j+1));
                double score = scan.nextDouble();
                total=total+score;
               }
               double average = total/numberOfTests;
               System.out.println("The average for student # "+(i+1)+" is "+average);
           }
           scan.close();
    }
}

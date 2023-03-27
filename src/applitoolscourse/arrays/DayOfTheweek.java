package src.applitoolscourse.arrays;
import java.util.Scanner;
/*
 * Make an array that holds its actual values of the days of the week, 
 * and then have the user input a number corresponding to some day of the week. And assume that the week starts on Monday.
 * Your program should output the String that represents the day of the 
 * week that corresponds to the number that the user input. 
 * For example, if the user inputs the number 1, your program should print “Monday”. 
 */
public class DayOfTheweek {
    private static String weekDays[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private static int dayNumber;
    private static Scanner scan = new Scanner(System.in);

    // public static void setDayNumber(int dayNumber){
    //     dayNumber = scan.nextInt();
    // }
    
    // public static String searchDayOfTheWeek(String dayOfTheWeek){
    //    for(int i=1; i<weekDays.length ; i++){
    //         if(weekDays[i] == dayOfTheWeek){
    //             break;   
    //         }
    //    }
    //    return dayOfTheWeek;
    // }

    // public static void printDayOfTheWeek(int dayNumber){
    //     if(dayNumber == 1){
    //         System.out.println("Day of the week is: "+searchDayOfTheWeek("Monday"));
    //     }
    //     else if(dayNumber == 2){
    //         System.out.println("Day of the week is: "+searchDayOfTheWeek("Tuesday"));
    //     }
    //     else if(dayNumber == 3){
    //         System.out.println("Day of the week is: "+searchDayOfTheWeek("Wednesday"));
    //     }
    //     else if(dayNumber == 4){
    //         System.out.println("Day of the week is: "+searchDayOfTheWeek("Thursday"));
    //     }
    //     else if(dayNumber == 5){
    //         System.out.println("Day of the week is: "+searchDayOfTheWeek("Friday"));
    //     }
    //     else if(dayNumber == 6){
    //         System.out.println("Day of the week is: "+searchDayOfTheWeek("Saturday"));
    //     }
    //     else if(dayNumber == 7){
    //         System.out.println("Day of the week is: "+searchDayOfTheWeek("Sunday"));
    //     }
    //     else {
    //         System.out.println("Invalid day. Please enter day between 1-7");
    //     }
    //     scan.close();
    // }
    public static void main(String args[]){
        System.out.println("Enter day number of your choice: ");
        dayNumber = scan.nextInt();
        scan.close();
        System.out.println("Day of the week is: "+ weekDays[dayNumber-1]);
        
    }
    
}

package hackerRankpracticechallenges.problems.src.staticblocks;

import java.util.Scanner;

public class StaticInitializer {

    static Scanner scan = new Scanner(System.in);
    static int number;
    static boolean flag;
    public static void myException() {
        System.out.println("Enter number:");
        number = scan.nextInt();
        try {
            if (number < 10) {
                flag=false;
                throw new Exception("Breadth and height must be positive");
            }
            else{
                flag = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static {
       myException();
    }

    public static void main(String args[]) {
        System.out.println("flag:"+flag);
        scan.close();
    }

    // class testException extends Exception {
    //     public void myException() {
    //         try {
    //             if (number < 10) {
    //                 throw new Exception("Breadth and height must be positive");
    //             }
    //         } catch (Exception e) {
    //             System.out.println(e);
    //         }
    //     }

    // }
}

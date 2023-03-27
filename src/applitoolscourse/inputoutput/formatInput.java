package src.applitoolscourse.inputoutput;

import java.util.Scanner;
public class formatInput {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter String: ");
        // String s1 = scan.next();
        // System.out.println("Enter Integer: ");
        // int i = scan.nextInt();
        // scan.close();
        // System.out.printf("'%-10S'",s1);
        // System.out.printf("'%-3d'",i);

        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=scan.next();
            int x=scan.nextInt();
            //Complete this line
            System.out.printf("%-15s",s1);
            System.out.printf("%03d%n",x);
        }
        System.out.println("================================");
        

        
    }
}

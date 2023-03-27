package src.applitoolscourse.javaFundamentals;
import java.util.Scanner;
public class MadLibs {
    public static void main(String arg[]){
       Scanner scan  = new Scanner(System.in);

       //1. Get the season of the year
       System.out.println("Which season of the year do you like:");
       String season=scan.nextLine();

       //2. Get the number of cups of coffee
       System.out.println("How many cups of coffee would you drink:");
       int cups=scan.nextInt();
       scan.nextLine();

       //3. Get the adjective
       System.out.println("What do you like about the season:");
       String adjective=scan.nextLine();
       scan.close();
       System.out.println("On a "+adjective+" "+season+" "+"day, "+"I drink "
       +"a minimum of "+cups+" "+"cups of coffee");
    }
}

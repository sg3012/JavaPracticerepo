package src.applitoolscourse.relationalandlogicaloperators;
import java.util.Scanner;
/*
  Relational operators:
  >,<, >=,<=,!=,==
  Logical operators:
  &&,||,!
  The objective of the game is to 
  enter enough change to equal exactly one rupee.
  1. Ask user how many 5 paise coins he would like to enter?
  2. Ask user how many 10 paise coins he would like to enter?
  3. Ask user how many 25 paise coins he would like to enter?
  4. Ask user how many 50 paise coins he would like to enter?
  5. After entering the number of coins - calculate the value 
     obtained by these coins.
  6. IF the value is equal to exactly one rupee then user wins.
  7. if the value is less than one rupee then tell the user how many he was short of one rupee
  8. If the value is more than one rupee then tell the user how many he went over
*/
public class OneRupeeGame {
    public static void main(String arg[]){
        double numberOf5PaisaCoins;
        double numberOf10PaisaCoins;
        double numberOf25PaisaCoins;
        double numberOf50PaisaCoins;
        double paisa5=5;
        double paisa10=10;
        double paisa25=25;
        double paisa50=50;

        // Initialize the known values
        int oneRupee = 1;

        // Get the unkown values from user input
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Rupee Game'! " +
                "Your goal is to enter enough change to make exactly Rs1.00");

        System.out.println("Enter the number of 5 paisa coins");

        numberOf5PaisaCoins=scan.nextInt();

        System.out.println("Enter the number of 10 paisa coins");

        numberOf10PaisaCoins=scan.nextInt();

        System.out.println("Enter the number of 25 paisa coins");

        numberOf25PaisaCoins=scan.nextInt();

        System.out.println("Enter the number of 50 paisa coins");

        numberOf50PaisaCoins=scan.nextInt();

        scan.close();

        // Calculate the total value of all the currency coins entered
        double totalValue = ((numberOf5PaisaCoins*paisa5)+(numberOf10PaisaCoins*paisa10)
                           +(numberOf25PaisaCoins*paisa25)
                           +(numberOf50PaisaCoins*paisa50))/100;
        double oneRupeeShort=oneRupee-totalValue;
        double oneRupeeMore=totalValue-oneRupee;

        // Compare and make the decision
        if(totalValue<oneRupee){
            System.out.println("Sorry, you remained short of"
            +" One Rupee by "+oneRupeeShort+" Rupee(s)");
        }
        else if(totalValue>oneRupee){
            System.out.println("Sorry, you went over"
            +" One Rupee by "+oneRupeeMore+" Rupee(s)");
        }
        else {
            System.out.println("Yay!, you have won the game");
        }
    }
}

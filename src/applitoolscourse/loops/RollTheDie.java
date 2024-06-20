package src.applitoolscourse.loops;
import java.util.Random;
/**
 * NESTED LOOPS
 * The objective of this game is to travel the
 * entire game board of 20 spaces within 5 die rolls.
 *
 * Roll the die for the user (generate a Random number between 1 – 6)
 * and advance the user that number of spaces on the game board.
 * After each roll, tell the user which game space they are on and
 * how many more spaces they have to go to win.
 * Repeat this 4 additional times, for 5 rolls in total.
 * However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
 * If they are greater than or less than 20 spaces exactly, they lose.
 * Remember there are only 20 spaces on the board, so a message
 * like “You advanced to space 22” is a bug.
 * Example Output:
 * Roll #1: You've rolled a 3. You are now on space 3 and have 17 more to go.
 * Roll #2: You've rolled a 3. You are now on space 6 and have 14 more to go.
 * Roll #3: You've rolled a 3. You are now on space 9 and have 11 more to go.
 * Roll #4: You've rolled a 5. You are now on space 14 and have 6 more to go.
 * Roll #5: You've rolled a 6. You're on space 20. Congrats, you win!
 */

public class RollTheDie {
    public static void main(String arg[]){
        System.out.println("WELCOME TO ROLL THE DIE GAME. LET'S BEGIN....");
        // Initialize the known variables:
        int dieRolls=5;
        int numberOfBoardSpaces=20;
        int currentPosition=0;
        boolean winOrLose=false;

        // Generate the random number between 1-6 (number on the die)
        int numberOnDie;
        Random random = new Random();
        for(int i=0; i<dieRolls;i++){
            numberOnDie = random.nextInt(6)+1;
            currentPosition =currentPosition + numberOnDie;
            int remainingSpaces = numberOfBoardSpaces-currentPosition;
            System.out.print("You've rolled a "+numberOnDie+". ");
            if(currentPosition>numberOfBoardSpaces){
                break;
            }
            else if(currentPosition==numberOfBoardSpaces){
                winOrLose=true;
                break;
            }
            else{
                System.out.println("You are now on space "+currentPosition+" and have "+remainingSpaces+
                " more to go.");
            }
        }
        if(winOrLose){
            System.out.println();
            System.out.println("Cograts! You have won");
        }
        else{
            System.out.println();
            System.out.println("Sorry! You lose. Your latest position was "+currentPosition);
        }
    }
}

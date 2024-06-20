package src.applitoolscourse.arrays;
import java.util.Arrays;
import java.util.Random;
public class LotteryTicket {
    private static final int LENGTH = 6;

    private static final int MAX_TICKET_NUMBER =69;

    public static int[] generateNumbers(){

        int ticket [] = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i<LENGTH;i++){
            int randomNumber;

            /**
             * Generate random number then search to make
             * sure it already doesn't exist in the array. If it does regenerate and search again.
             */
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
            }while(search(ticket, randomNumber));

            /**
             * Number is unique if we get here. Add it to the array.
             */
            ticket[i] = randomNumber;
        }
    return ticket;
    }

    /**
     * This method does a sequential search on the array to find a value
     * @param array Array to search the element in
     * @param numberToSearch value to search in the array
     * @return true if element found, false if not
     */
    public static boolean search(int array[], int numberToSearch){

        /*This is called enhanced for loop.
         *It iterates through 'array' and
         *each time assigns the current array element to 'value'.
        */

        for(int value:array){
            if(value == numberToSearch){
                return true;
            }
        }
        /*If we've reached this point, the entire array was searched
         and the element was not found */
        return false;
    }

    public static boolean binarySrch(int array[], int numberToSearch){

        // Array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearch);

        if(index>=0){
            return true;
        } else {
			return false;
		}
    }

    public static void printTicket(int ticket[]){
      for(int i=0; i< LENGTH; i++){
          System.out.print(ticket[i]+ " | ");
      }
    }

    public static void main(String args[]){
      int ticket[] = generateNumbers();
      Arrays.sort(ticket);
      printTicket(ticket);
    }
}

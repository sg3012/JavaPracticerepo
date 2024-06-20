package src.applitoolscourse.datatypes;

public class ReverseString {

    /**
     * Prints a given String in reverse Order
     * @param text String to be reversed
     */
    public static void reverseString(String text){
        for(int i = text.length()-1; i>=0 ; i-- ){
           System.out.print(text.charAt(i));
        }
    }

    public static void main(String args[]){

        reverseString("Hello Shubham!");
    }
}

package src.applitoolscourse.datatypes;

public class TextProcessor {
    
    /**
     * Splits a string into an array by tokenizing it.
     * Counts words and prints them.
     * @param text String parameter which needs splitting and counting.
     */
    public static void countwords(String text){
       // Var is a new way of declaring variables in JAVA
       // by not specifying the data types explicitly. This
       // helps the user to use which ever data type during run time.
       var words = text.split(" ");
       int numberOfWords = words.length;

       String message = String.format("Your String contains %d words", numberOfWords);
       System.out.println(message);

       for(int i=0; i< numberOfWords; i++){
           System.out.println(words[i]);
       }
    }

    public static void main(String args[]){
        countwords("Selenium automation using JAVA");
    }    
}

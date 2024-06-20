package src.applitoolscourse.datatypes;

public class ReorderString {

    /**
     * Add spaces before each uppercase letter in a string
     * @param text Jumbled String
     */
    public static void addSpaces(String text){

        var modifiedString = new StringBuilder(text);

        for(int i =0; i< modifiedString.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedString.charAt(i))){
                modifiedString.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedString);
    }

    public static void main (String args[]){
        addSpaces("HelloWorldIt'sMeShubham");
    }
}

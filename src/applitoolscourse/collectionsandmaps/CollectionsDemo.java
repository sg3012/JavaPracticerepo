package src.applitoolscourse.collectionsandmaps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo{

    public static void setDemo(){

        // The way we have passed String in the angular brackets
        // after the keyword Set is called JAVA generics.
        // JAVA generics will help to convert a raw Object into
        // a particular data type.
        Set<String> fruit  = new HashSet<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        // System.out.println(fruit);

        // 1. iterate over a set using iterator
        // var i  = fruit.iterator();

        // while(i.hasNext()){
        //    // loop through every element of the set and print the next element.
        //    System.out.println(i.next());
        // }

         // 2. iterate over a set using enhanced for loop
         for(String item : fruit){
            System.out.println(item);
         }
    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        // size returns the number of elements in a map
        // System.out.println(fruitCalories.size()); // 4
        System.out.println(fruitCalories);

        // // get method is used to return the value of
        // // a key passed an String argument
        // System.out.println(fruitCalories.get("lemon"));

        // // entrySet() method converts a map into set.
        // System.out.println(fruitCalories.entrySet());

        // // As the name suggests remove method will remove
        // // a key and it's value from the map. Takes
        // // key as an String argument.
        // fruitCalories.remove("Orange");
        // System.out.println(fruitCalories);

        /*1. Iterate over a map using enhanced for loop
             - Define the map using JAVA generics as the one
               that contains String key and an integer value.
               For e.g. : Map <String, Integer> = new HashMap();
            - Convert map into set using entrySet method.
            - Now interate over the set and print the value
              using getValue method inside the loop.
        */
        // for(var entry : fruitCalories.entrySet()){
        //     System.out.println(entry.getValue());
        // }
    }

    public static void main(String args[]){
    //    setDemo();
    //    listDemo();
    //    queueDemo();
          mapDemo();
    }
}
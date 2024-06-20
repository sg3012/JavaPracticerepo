package src.applitoolscourse.datatypes;

public class Splitting {

    public static void main(String args[]){
        String fruit= "avacado";
        String arr[] = fruit.split("a");
        System.out.println(arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.println("Iteration:"+(i+1));
            System.out.println(arr[i]);
        }
    }

}

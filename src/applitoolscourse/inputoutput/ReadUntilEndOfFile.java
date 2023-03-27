package src.applitoolscourse.inputoutput;
import java.util.Scanner;
public class ReadUntilEndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count =0;  
        // Integer n = (Integer)scan.nextInt();
        // scan.nextLine();
        while(scan.hasNext()){
        ++count;    
        String s1 = scan.nextLine();
        System.out.println(count+" "+s1);
        }
        scan.close();
        }
}

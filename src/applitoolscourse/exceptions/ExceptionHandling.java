package src.applitoolscourse.exceptions;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);

            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } 
        // To use multiple exception types
        // in a single catch block's parameter list, we use the 
        // pipe symbol like below
        catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
        finally{
            fileReader.close();
        }

    }

    public static void main(String args[]) {
        createNewFile();
        numbersExceptionHandling();
    }

}

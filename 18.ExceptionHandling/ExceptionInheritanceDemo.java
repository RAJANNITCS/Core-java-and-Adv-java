// WAP to demostrating parent and child 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionInheritanceDemo {
    public static void main(String[] args) {

        try {
            // Trying to open a file
            FileInputStream file = new FileInputStream("abc.txt");

        } catch (FileNotFoundException e) {
            // Child exception handled first
            System.out.println("File not found exception handled.");

        } catch (IOException e) {
            // Parent exception handled later
            System.out.println("IO exception handled.");

        } catch (Exception e) {
            // Generic parent
            System.out.println("General exception handled.");
        }
    }
}

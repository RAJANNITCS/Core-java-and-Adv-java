import java.io.FileReader; // Importing FileReader class
import java.io.IOException; // Importing IOException class

public class CheckedExample {

    public static void main(String[] args) {

        try {
            // Trying to open a file
            FileReader file = new FileReader("test.txt");
        } catch (IOException e) {
            // Handling the exception
            System.out.println("File not found!");
        }

    }
}

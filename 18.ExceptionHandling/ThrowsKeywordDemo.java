// WAP to demostrating throws keywords 

import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeywordDemo {
    public static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);

    }

    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (IOException e){
            
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

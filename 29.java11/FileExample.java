// WAP to demostrating 

import java.nio.file.Files;   // Files utility class
import java.nio.file.Path;    // Represents file path

public class FileExample {
    public static void main(String[] args) throws Exception {

        // Create path object pointing to file
        Path path = Path.of("text.txt");

        // Read entire file content as String
        String content = Files.readString(path);

        // Print content
        System.out.println(content);
    }
}


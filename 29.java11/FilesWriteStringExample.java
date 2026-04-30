// WAP to demostrating File WriteString method 

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesWriteStringExample {
    public static void main(String[] args) throws Exception {

        // Create path for files
        Path path = Path.of("Output.txt");

        // Write string content to file
        Files.writeString(path, "Hello Java 11");

        System.out.println("File writen succcessfully");
    }
}

// WAP to demostrating try with resources 

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResources {
    public static void main(String[] args) throws Exception {

        // Resource declared outside try block
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));

        // Java 9 enhancement
        try (br) {
            // Use resource
            System.out.println(br.readLine());
        }
    }
}

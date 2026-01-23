// WAP to demostrating where String Pool might NOT be beneficial

import java.util.UUID;

public class BadInterningExample {
    public static void main(String[] args) {

        // This loop is DANGEROUS and SLOW
        for (int i = 0; i < 1000000; i++) {
            // Generating a uniaue ID
            String uniqueID = UUID.randomUUID().toString();

            // WRONG : Adding a unique ID to the pool 
            // This will slow down the JVM and waste money

            uniqueID.intern();

            // System.out.println(uniqueID);

            if (i % 1000000 == 0) {
                System.out.println("Processed " + i + " unique strings");
            }
        }
    }
}
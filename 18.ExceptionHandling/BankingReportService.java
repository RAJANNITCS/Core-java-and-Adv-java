// WAP to demostrating try - with - resources 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BankingReportService {

    public static void generateReport(String inputPath, String outputPath) {
        // We declare multiple resources separated by a semicolon;
        // These will be closed in REVERSE order of their declaration.

        try (
            // Resource 1 : Reading the transaction file
            BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            // Resource 2 : Writing the processed Report 
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

        ) {
            String line;

            // Read line by line
            while ((line = reader.readLine()) != null) {

                // Filter only SUCCESS transactions
                if (line.contains("SUCCESS")) {
                    writer.write("Processed: " + line);
                    writer.newLine();
                }
            }

            // No need to close manually
            // Java automatically closes writer first, then reader
        } catch (IOException e) {
            // Log the error for the production support team
            System.err.println("Error processing banking report: " + e.getMessage());
            
            // Checking for suppressed exceptions (rare but useful)
            for (Throwable t : e.getSuppressed()) {
                System.err.println("Suppressed error during close: " + t);
            }
        }
    }

    public static void main(String[] args) {
        generateReport("test.txt","outpout.txt");
    } 
}

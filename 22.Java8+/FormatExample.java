// WAP to formate date 

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {
        // Get current date
        LocalDate date = LocalDate.now();

        // Define format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Format date
        String formatted = date.format(formatter);

        // Print date 
        System.out.println(formatted);
    }
}

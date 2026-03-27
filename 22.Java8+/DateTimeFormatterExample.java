// WAP to demostrating DateTimeFormatter class methods

import java.time.format.DateTimeFormatter;
import java.time.*;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        // Step 1 : Create a LocalDate object (current date)
        LocalDate today = LocalDate.now();

        // Step 2 : Create formatter with custom pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Step 3 : Format date to String
        String formattedDate = today.format(formatter);

        System.out.println("Formatted Date: " + formattedDate);

        // Step 4 : Parse String back to LocalDate 
        LocalDate parsedDate = LocalDate.parse(formattedDate,formatter);

        System.out.println("Parsed Date : " + parsedDate);
    }
}

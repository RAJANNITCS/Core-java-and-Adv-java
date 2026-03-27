// WAP to demostrating Local date time class

import java.time.*;

public class DateTimeExample {
    public static void main(String[] args) {

        // Get current date
        LocalDate date = LocalDate.now();
        // Return system date (YYYY-MM-DD)

        // Get current time
        LocalTime time = LocalTime.now();
        // Return system time (HH:MM:SS)

        // Get date + time
        LocalDateTime dateTime = LocalDateTime.now();
        // Combine date and time

        // Print value
        System.out.println("Date : " + date);
        System.out.println("Time : " + time);
        System.out.println("Date Time : " + dateTime);
    }
}

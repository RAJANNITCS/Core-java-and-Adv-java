// WAP to demostrating create new date from date

import java.time.LocalDate;

public class AddDaysExample {
    public static void main(String[] args) {

        // Crate a date
        LocalDate today = LocalDate.now();

        // Add t days (returns new object)
        LocalDate futureDate = today.plusDays(5);

        // Print both 
        System.out.println("Today : " + today);
        System.out.println("Future Date : " + futureDate);
    }
}

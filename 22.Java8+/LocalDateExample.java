// WAP to demostrating LocalDate and it's method

import java.time.*; // import LocalDate
import java.time.temporal.ChronoUnit; // for calculating difference

public class LocalDateExample {
    public static void main(String[] args) {

        // Step 1 : Employee Date of Birth
        LocalDate dob = LocalDate.of(2000, 5, 15);

        // Step 2 : Current Date
        LocalDate today = LocalDate.now();

        // Step 3 : Calculate age
        long age = ChronoUnit.YEARS.between(dob, today);
        // Calculate difference in year

        // Step 4 : Print result
        System.out.println("Employee age : " + age);
    }
}

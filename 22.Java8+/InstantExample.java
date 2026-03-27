// WAP to demostrating Instant class and method

import java.time.Instant;
import java.util.*;

public class InstantExample {
    public static void main(String[] args) {

        // Get current time in UTC
        Instant now = Instant.now();

        // Create Instant from epoch seconds
        Instant fromSeconds = Instant.ofEpochSecond(1000);

        // Convert Instant to miliseconds
        long millis = now.toEpochMilli();

        // add 60 seconds
        Instant future = now.plusSeconds(60);
        System.out.println("After 60 seconds: " + future);

        System.out.println("Current Instant : " + now);
        System.out.println("From seconds : " + fromSeconds);
        System.out.println("Miliseconds : " + millis);
    }
}

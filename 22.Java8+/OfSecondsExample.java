// WAP to demostrating OfSeconds method of Duration

import java.time.*;

public class OfSecondsExample {
    public static void main(String[] args) {

        // Create duration of 60 seconds
        Duration duration = Duration.ofSeconds(60);

        System.out.println(duration);
    }
}

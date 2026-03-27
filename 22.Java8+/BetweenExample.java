// WAP to demostrating between method of Duration class

import java.time.*;

public class BetweenExample {
    public static void main(String[] args) {

        Instant start  = Instant.now(); // current time

        // simulate delay 
        try {
            Thread.sleep(2000); // sleep for 2 seconds 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant end = Instant.now();

        // calculate differnce 
        Duration duration = Duration.between(start, end);

        System.out.println(duration.getSeconds()); // 2
    }
}

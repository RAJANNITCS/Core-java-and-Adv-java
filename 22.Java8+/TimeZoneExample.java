// WAP to convert india time to US Time

import java.time.*;

public class TimeZoneExample {
    public static void main(String[] args) {

        // Step 1 : Current time in India
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Step 2 : Convert to US time
        ZonedDateTime usTime = indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        // Step 3 : Print both
        System.out.println("India Time : " + indiaTime);
        System.out.println("US Time :" + usTime);
    }
}

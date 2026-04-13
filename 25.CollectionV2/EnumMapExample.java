// WAP to demostrating EnumMap class and Method 

import java.util.*;

// Define enum with fixed constants
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class EnumMapExample {
    public static void main(String[] args) {

        // Create EnumMap with key type Day
        Map<Day, String> schedule = new EnumMap<>(Day.class);

        // Add values
        schedule.put(Day.MON, "Office");
        schedule.put(Day.TUE, "Gym");
        schedule.put(Day.FRI, "Party");

        // Fetch value 
        System.out.println(schedule.get(Day.MON));

        // Iterate
        for (Day day : schedule.keySet()) {
            System.out.println(day + "->"+schedule.get(day));
        }
    }
}

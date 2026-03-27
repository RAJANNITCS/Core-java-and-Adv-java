// WAP to demostrating Period class method

import java.time.*;

public class PeriodExample {
    public static void main(String[] args) {

        // Create start date (year , month, day)
        LocalDate startDate = LocalDate.of(2020,1,10);

        // Create end date
        LocalDate endDate  = LocalDate.of(2025, 3, 25);

        // Calculate difference between two dates
        Period period = Period.between(startDate, endDate);

        // Print full period
        System.out.println("Period : " + period);

        // Extract individual values
        System.out.println("Year: " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days :" + period.getDays());
    }
}

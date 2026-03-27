// WAP to check employee clockin time 

import java.time.*;

public class OfficeTimeCheck {
    public static void main(String[] args) {
        
        // Step 1 : Office start time (9:00 AM)
        LocalTime officeStart = LocalTime.of(9,0);

        // Step 2 : Employee login time (example)
        LocalTime loginTime = LocalTime.now();

        // Step 3 : Check if late
        if (loginTime.isAfter(officeStart)) {
            System.out.println("Employee is lete");
        } else {
            System.out.println("On Time");
        }
    }
}

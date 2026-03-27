// WAP to demostrating Order Processing System

import java.time.*;

public class OrderExample {
    public static void main(String[] args) {

        // Step 1 : Order creation timestamp
        LocalDateTime orderTime = LocalDateTime.now();

        // Step 2 : Estimated delivery (after 3 days)
        LocalDateTime deliveryTime = orderTime.plusDays(3);

        // Step 3 : Print details
        System.out.println("Order time : " + orderTime);
        System.out.println("Delivery Time : " + deliveryTime);
    }
}

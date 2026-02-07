// WAP to demostrating Interface in java

// 1. The Interface (The Contract)
interface NotificationService {
    // A constant variable
    String HEADER = "OFFER: ";

    // Abstract method (no body)
    void sendNotification(String message);

    // Default method (Java 8+) - optional to override
    default void logNotification(String type) {
        System.out.println("Logging " + type + " notification to database....");
    }

    // Static method (Java 8+) - utility method
    static boolean isValidMessage(String msg) {
        return msg != null && !msg.isEmpty();
    }
}

// 2. Email Implementation
class EmailNotification implements NotificationService {

    @Override
    public void sendNotification(String message) {
        // Line by line: Prints the constant plus the email logic
        System.out.println("Sending Email: " + HEADER + message);
    }
}

// 3. SMS Implementation
class SmsNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        // Line by line: Prints the constant plus the SMS logic
        System.out.println("Sending SMS: " + HEADER + message);
    }
}

public class NotificationSystemDemo {
    public static void main(String[] args) {
        // We use the Interface type for the reference (Polymorphism)
        NotificationService service = new EmailNotification();
        
        if (NotificationService.isValidMessage("Hello!")) {
            service.sendNotification("Your order is shipped."); // Calls Email version
            service.logNotification("EMAIL"); // Calls default method
        }
    }
}

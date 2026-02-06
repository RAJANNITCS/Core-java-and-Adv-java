// WAP to use of polymorphism in notification systems

// 1. Define the Interface (The Contract)

interface Notification {
    void send(String massage);
}

// 2. Concrete Implementation for Email
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        // Line by line: We simulate connecting to an SMTP server
        System.out.println("Connecting to SMTP Server...");
        System.out.println("Email sent with content: " + message);
    }
}

// 3. Concrete Implementation for SMS
class SmsNotification implements Notification {
    @Override
    public void send(String message) {
        // Line by line: We simulate connecting to a Telecom Gateway
        System.out.println("Connecting to SMS Gateway...");
        System.out.println("SMS sent with content: " + message);
    }
}

// 4. The Main Application (The Polymorphic Trigger)
public class NotificationSystemDemo {
    public static void main(String[] args) {
        // We can hold different objects in a List of the Interface type
        java.util.List<Notification> list = new java.util.ArrayList<>();
        
        list.add(new EmailNotification()); // Adding an Email object
        list.add(new SmsNotification());   // Adding an SMS object

        // This is the beauty of polymorphism:
        // One loop, one method call, but different behaviors!
        for (Notification n : list) {
            n.send("Hello! Your order is ready."); 
            // When n is Email, it runs Email code.
            // When n is SMS, it runs SMS code.
        }
    }
}

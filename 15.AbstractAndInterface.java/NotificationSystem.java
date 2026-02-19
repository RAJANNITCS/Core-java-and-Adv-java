// WAP to demostrating when to use interfaces

// Interface defining contract
interface NotificationService {

    // Abstract method (public by default)
    void sendNotification(String message);

}

class EmailService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}


public class NotificationSystem {
    public static void main(String[] args) {
        NotificationService notification = new EmailService();
        notification.sendNotification("Hello World !!!");

        notification = new SMSService();
        notification.sendNotification("Hello World !!!");
    }
}

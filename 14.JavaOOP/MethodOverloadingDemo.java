// WAP to demostrating method overloading 

class Notification {

    // Method to send notification via Email
    void send(String message) {
        System.out.println("Sending Email: " + message);
    }

    // Overloaded method to send via Email with a Subject
    // Different number of parameters
    void send(String message, String subject) {
        System.out.println("Sending Email [" + subject + "]: " + message);
    }

}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Notification obj = new Notification();
        obj.send("only message send");
        obj.send("send mass with subject", "subject");
    }
}
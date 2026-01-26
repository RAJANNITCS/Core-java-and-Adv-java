// WAP to demostrating of using class without creating object

class BankConfig {
    // 1. Static Variable: Shared by everyone
    public static String bankName = "Java Standard Bank";
    
    // 2. Static Block: Runs once when class is loaded
    static {
        System.out.println("BankConfig class is being loaded into memory...");
        // This is a great place to initialize database connections or logs
    }

    // 3. Static Method: No object needed to call this
    public static double calculateInterest(double principal, double rate) {
        // Line-by-line: Takes two numbers and returns the result.
        // It doesn't need to know "which" customer this is.
        return (principal * rate) / 100;
    }
}

public class ClassUseWithoutObjectCreation {
    public static void main(String[] args) {
        // LOOK: No 'new BankConfig()' here!
        
        // Accessing static variable directly
        System.out.println("Welcome to: " + BankConfig.bankName);
        
        // Calling static method directly
        double interest = BankConfig.calculateInterest(1000, 5.5);
        System.out.println("Interest calculated: " + interest);
    }
}
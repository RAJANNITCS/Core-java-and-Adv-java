// WAP to demostrating custom Exception

// Custom exception class
class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message); // Pass message to parent exception class
    }
}


public class CustomExceptionDemo {

    // 'throws' warns that this method might fail
    public static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            // 'throw' creates the error manually
            throw new InsufficientFundsException("You don't have enugh money !!!");
        }

        System.out.println("Withdrawal sucesfull !!!");
    }

    public static void main(String[] args) {
        try {
            // Attempt to withdraw money
            withdraw(100,500);
        } catch (InsufficientFundsException e) {
            // Catch the specific custom exception
            System.out.println("Error : " + e.getMessage());
        } finally {
            // This runs NO MATTER WHAT
            System.out.println("Transaction attempt finished. Logging to database...");
        }
    }
}

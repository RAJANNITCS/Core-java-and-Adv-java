// This class represents a single Bank Account
class BankAccount {
    private int balance = 1000;

    // Method to withdraw money
    // 'synchronized' ensures only one thread can touch the balance at a time
    public synchronized void withdraw(String threadName, int amount) {
        System.out.println(threadName + " is attempting to withdraw: " + amount);
        if (balance >= amount) {
            // Simulate processing time
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            balance -= amount;
            System.out.println(threadName + " SUCCESS. New Balance: " + balance);
        } else {
            System.out.println(threadName + " FAILED. Insufficient funds.");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        // This is our shared resource (stored in the Process Heap)
        BankAccount sharedAccount = new BankAccount();

        // Create Thread 1: ATM Withdrawal
        Thread atmThread = new Thread(() -> {
            sharedAccount.withdraw("ATM-Thread", 700);
        });

        // Create Thread 2: Mobile App Withdrawal
        Thread mobileThread = new Thread(() -> {
            sharedAccount.withdraw("Mobile-App-Thread", 500);
        });

        // Start both threads (The Process is now multi-threaded)
        atmThread.start();
        mobileThread.start();
    }
}
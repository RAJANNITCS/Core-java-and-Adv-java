// WAP to demostrating Synchronized block

class BankAccount {
    private int balance = 1000; // shared resource

    public void withdraw(String channel,int amount) {
        // Print which channel is requesting withdrawal
        System.out.println(channel + " is trying to withdraw ₹" + amount);

        // Synchronized block
         // only critical part synchronized
        synchronized(this) {
            this.balance = this.balance - amount; // critical operation
        }

        System.out.println(channel + " completed withdrawal.");
        System.out.println("Balance : " + balance);
    }
}


public class SynchronizedBlockDemo {
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // shared object

       // ATM withdrawal
        Thread atmThread = new Thread(() -> {
            account.withdraw("ATM Machine", 500);
        });

        // Mobile app withdrawal
        Thread mobileThread = new Thread(() -> {
            account.withdraw("Mobile App", 300);
        });

        // Start both transactions
        atmThread.start();
        mobileThread.start();
    }
}

// WAP to demostarting Reentrant lock 

import java.util.concurrent.locks.ReentrantLock;

class BankAccount {

    // Create ReentrantLock object
    private ReentrantLock lock = new ReentrantLock();

    private int balance = 1000;

    public void withdraw(String channel,int amount) {

        lock.lock(); // Step 1 : Acquire lock

        try {
            if (balance >= amount) {
                System.out.println("Withdrawing = " + amount + " by " + channel);
                this.balance = this.balance - amount; // Update balance
                System.out.println("Remaining balance : " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        } finally {
            lock.unlock(); // Step 2: Always release lock
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // ATM 
        Thread atm = new Thread(() -> account.withdraw("ATM", 300));

        // Mobile App
        Thread app = new Thread(() -> account.withdraw("By mobile app", 500));

        atm.start();
        app.start();
    }
}

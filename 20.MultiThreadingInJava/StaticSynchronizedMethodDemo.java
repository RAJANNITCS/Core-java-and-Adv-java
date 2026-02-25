// WAP to demostrating static synchronized method

// Bank class representing central bank system
class Bank {

    // Static variable shared across all branches
    private static int totalBankBalance = 10000;

    // Static synchronized method (Class-level lock)
    public static synchronized void deposit(String branchName, int amount) {

        // Print which branch is depositing
        System.out.println(branchName + " is depositing ₹" + amount);

        // Simulate processing delay (like DB update)
        try {
            Thread.sleep(2000); // 2 seconds delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Update total balance
        totalBankBalance = totalBankBalance + amount;

        // Print updated balance
        System.out.println(branchName + " updated total balance.");
        System.out.println("Total Bank Balance: ₹" + totalBankBalance);
        System.out.println("-----------------------------------");
    }
}

// Test class
public class StaticSynchronizedMethodDemo {

    public static void main(String[] args) {

        // Thread representing Delhi Branch
        Thread delhiBranch = new Thread(() -> {
            Bank.deposit("Delhi Branch", 5000);
        });

        // Thread representing Mumbai Branch
        Thread mumbaiBranch = new Thread(() -> {
            Bank.deposit("Mumbai Branch", 7000);
        });

        // Thread representing Bangalore Branch
        Thread bangaloreBranch = new Thread(() -> {
            Bank.deposit("Bangalore Branch", 3000);
        });

        // Start all branches simultaneously
        delhiBranch.start();
        mumbaiBranch.start();
        bangaloreBranch.start();
    }
}

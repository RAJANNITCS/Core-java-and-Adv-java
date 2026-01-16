// WAP to demostrating The "Professional" Way (Getter and Setter)

class BankAccount {
    // Private field: Hidden from the outside world
    private double balance;

    // Getter: Allows controlled reading
    public double getBalance() {
        return balance;
    }

    // Setter: Allows controlled writing with validation
    public void setBalance(double amount) {
        // Validation logic
        if (amount < 0) {
            System.out.println("Error: Balance cannot be negative!");
        } else {
            // "this" refers to the current object's field
            this.balance = amount;
        }
    }
}

public class ProWayToUseVariable {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        sbi.setBalance(-100000);

    }
}
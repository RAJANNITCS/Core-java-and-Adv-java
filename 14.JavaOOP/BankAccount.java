class BankAccount {

    // Private variable - hidden from outside
    private double balance;

    // Constructor controls initial value
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    // Business operation instead of setter
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        balance += amount;
    }

    // Business operation instead of setter
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    // Controlled read (optional)
    public double getBalance() {
        return balance;
    }
}

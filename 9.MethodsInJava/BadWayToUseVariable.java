// WAP to demostrating bad way to use variable in java

class Account {
    public double balance; // DANGEROUS : anyone can change this
}

public class BadWayToUseVariable {
    public static void main(String[] args) {
        // Usage:
        Account acc = new Account();
        acc.balance = -1000.0; // ERROR: Balance should never be negative, but code allows it!

        System.out.println("balance is " + acc.balance);
    }
}
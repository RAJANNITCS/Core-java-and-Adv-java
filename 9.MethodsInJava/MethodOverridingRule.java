// WAP to demostrating Is restricted access to derived method allowed


// Parent Class representing a generic Bank Account
class BankAccount {
    // This method is public - anyone can call it
    public void withdraw(double amount) {
        System.out.println("Withdrawing: " + amount);
    }
}

// Subclass representing a Savings Account
class SavingsAccount extends BankAccount {
    
    // ATTEMPTING TO RESTRICT ACCESS (This will cause a COMPILE ERROR)
    // @Override
    // private void withdraw(double amount) { 
    //     System.out.println("Savings withdrawal logic");
    // }
    
    // CORRECT WAY: Must keep it 'public' (or wider, but public is the limit)
    @Override
    public void withdraw(double amount) {
        System.out.println("Applying interest and withdrawing: " + amount);
    }
}


public class MethodOverridingRule {
    public static void main(String[] args) {
        // Polymorphism in action
        BankAccount account = new SavingsAccount();
        
        // The compiler thinks this is a BankAccount, so it allows the call.
        // If the actual object (SavingsAccount) had made this private,
        // the JVM wouldn't know what to do here!
        account.withdraw(100.0);
    }
}
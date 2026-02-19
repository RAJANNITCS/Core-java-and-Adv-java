// WAP to demostrating when to use abstraction class except interface

// Abstract base class
abstract class Loan {

    // Common state (shared by all loans)
    protected String loanId;       // Loan ID
    protected String customerName; // Customer name
    protected double interestRate; // Interest rate

    // Constructor to initialize common fields
    public Loan(String loanId, String customerName, double interestRate) {
        this.loanId = loanId;               // Assign loan ID
        this.customerName = customerName;   // Assign customer name
        this.interestRate = interestRate;   // Assign interest rate
    }

    // Concrete method (common logic)
    public double calculateEMI(double principal) {
        return (principal * interestRate) / 12;  // Simple EMI calculation
    }

    // Abstract method (must be implemented by child class)
    public abstract void processLoan(); 
}

// Child class extending abstract class
class HomeLoan extends Loan {

    // Constructor
    public HomeLoan(String loanId, String customerName, double interestRate) {
        super(loanId, customerName, interestRate);  // Call parent constructor
    }

    // Implement abstract method
    @Override
    public void processLoan() {
        System.out.println("Processing Home Loan");
    }
}

public class LoanProcessSystem {
    public static void main(String[] args) {
        HomeLoan obj = new HomeLoan("0111", "rajan singh", 10.1);
        obj.processLoan();
    }
}

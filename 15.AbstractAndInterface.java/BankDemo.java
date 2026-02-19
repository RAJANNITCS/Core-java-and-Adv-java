// WAP to achive abstraction using Encapsulation (Private Methods)

class BankService {

    // Public method exposed to user
    public void transfer(double amount) {
        this.validate(amount);
        this.debit(amount);
        this.credit(amount);
    }

    // Hidded internal logic
    private void validate(double amount) {
        System.out.println("Validating Amount");
    }

    private void debit(double amount) {
        System.out.println("Debiting Amount");
    }

    private void credit(double amount) {
        System.out.println("Crediting Amount");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankService sbi = new BankService();
        sbi.transfer(100);
    }
}

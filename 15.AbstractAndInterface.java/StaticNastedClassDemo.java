// WAP to demostrating Static Nasted class

class Bank {

    static class Account {
        void showAccountType() {
            System.out.println("Saving Account");
        }
    }
}

public class StaticNastedClassDemo {
    public static void main(String[] args) {

        // Creating object of static nasted class
        Bank.Account account = new Bank.Account();

        account.showAccountType();
    }
}

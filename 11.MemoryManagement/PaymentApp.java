// WAP to create payment app

// common interface for all plugins 
interface PaymentPlugin {
    void pay();
}

// Plugin 1
class CreditCardPlugin implements PaymentPlugin {
    public void pay() {
        System.out.println("Payment done using Credit card");
    }
}

// plugin 2
class UpiPlugin implements PaymentPlugin {
    public void pay() {
        System.out.println("Payment done using upi");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        PaymentPlugin plugin = new UpiPlugin(); // plugin added
        plugin.pay();
    }
}
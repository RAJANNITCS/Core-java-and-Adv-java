// WAP to achive abstraction using Factory pattern

class PaymentService {

    public void pay(double amount) {
        System.out.println("Paid: " + amount);
    }
}

class Payment {

    public static PaymentService getPaymentService() {
        return new PaymentService();
    }
}

public class PaymentFactoryMethodDemo {
    public static void main(String[] args) {
        PaymentService service = Payment.getPaymentService();
        service.pay(100);
    }
}
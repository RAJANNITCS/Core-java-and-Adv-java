// WAP to demostrating loose coupling 

interface PaymentService {

    // abstract method
    public void pay(double amount);

}

// Paytm implementation
class PaytmPayment implements PaymentService {

    // Implementing pay method
    public void pay(double amount) {
        System.out.println("Paid using Paytm : " + amount);
    }
}

// Razorpay implementation
class RazorpayPayment implements PaymentService {

    // Implementing pay method 
    public void pay(double amount) {
        System.out.println("Paid using Razorpay : " + amount);
    }
}

class OrderServices {
    // Depend on interface, not implementation
    private PaymentService paymentService;

    // Constructor injection
    public OrderServices(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(double amount) {
        paymentService.pay(amount);
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        
        // Create implementation
        // PaymentService payment = new PaytmPayment();

        PaymentService payment = new RazorpayPayment();

        // Inject into OrderService
        OrderServices order = new OrderServices(payment);

        order.placeOrder(5000);
    }
}

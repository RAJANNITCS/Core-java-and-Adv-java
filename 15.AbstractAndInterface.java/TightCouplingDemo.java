// WAP to demostrating Tight coupling 

// This class handle paytm payments
class PaytmPayment {

    // Method to process payment
    public void pay(double amount) {
        // Printing payment message
        System.out.println("Payment done using paytm : " + amount);
    }
}

class OrderService {

    // Method to place order
    public void placeOrder(double amount) {
        // Directly Creating PaytmPayment object
        PaytmPayment paytm = new PaytmPayment();

        // Calling pay method 
        paytm.pay(amount);

        // Confirm order
        System.out.println("Order placed successfully");
    }
}

public class TightCouplingDemo {
    public static void main(String[] args) {
        // Creating OrderService object
        OrderService order = new OrderService();

        // Placing order
        order.placeOrder(5000);
    }
}

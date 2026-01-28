// WAP to demostrating Annonymous Inner Class

// We have a simple interface for processing payments
interface PaymentProcessor {
    void process(double amount);
}

public class CheckoutService {

    public static void completeOrder() {
        double totalAmount = 150.0;

        // Creating an anonymous Inner Class
        // We are implementing the interface "on the fly"
        PaymentProcessor creditCardProcessor = new PaymentProcessor() {
            // we can add private fields here if needed
            private String cardType = "VISA";

            @Override
            public void process(double amount) {
                // This code runs only for this specific instance
                System.out.println("Processing " + cardType + " payment of $" + amount);
            } 
        };

        // Calling the method
        creditCardProcessor.process(totalAmount);
    }

    public static void main(String[] args) {
        CheckoutService.completeOrder();
    }
}
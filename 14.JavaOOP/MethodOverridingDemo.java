// WAP to demostrating Method overriding 

// Parent Class
class Payment {
    // A general method for payment
    void process() {
        System.out.println("Processing general payment...");
    }
}

// Child Class 1
class CreditCard extends Payment {

    @Override // Tells the compiler we are overriding the parent
    void process() {
        System.out.println("Validating CVV and charging Credit Card...");
    }
}

// Child Class 2
class UPI extends Payment {

    @Override
    void process() {
        System.out.println("Opening UPI app and checking PIN...");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        // This is the most important part of polymorphism
        // Parent reference = Child object
        Payment myPayment = new CreditCard(); 
        
        // At runtime, JVM sees the object is CreditCard
        myPayment.process(); // Output: Validating CVV...

        myPayment = new UPI();
        // Now the same reference points to a UPI object
        myPayment.process(); // Output: Opening UPI app...
    }
}
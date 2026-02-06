// WAP to demostrating package-private

import pack1.PaymentFacade;

public class PaymentService {
    
    public static void process() {
        PaymentFacade facade = new PaymentFacade();
        boolean valid = facade.validate(1000);
        System.out.println("valid amount ="+valid);
    }

    public static void main(String[] args) {
        PaymentService.process();
    }
}

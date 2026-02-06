package pack1;
// WAP to demostrating package-private

public class PaymentFacade {

    private PaymentValidator validator = new PaymentValidator();

    public boolean validate(double amount) {
        return validator.validateAmount(amount);
    }
}

public class PaymentAdapter implements PaymentProcessor {
    private OldPaymentGateway oldGateway;

    public PaymentAdapter(OldPaymentGateway oldGateway) {
        this.oldGateway = oldGateway;
    }

    @Override
    public void processPayment() {
        oldGateway.payWithCard(); // Adapter translates to old method
    }
}

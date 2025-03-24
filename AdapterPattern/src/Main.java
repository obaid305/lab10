public class Main {
    public static void main(String[] args) {
        OldPaymentGateway oldGateway = new OldPaymentGateway();
        PaymentProcessor paymentProcessor = new PaymentAdapter(oldGateway);

        // Client only knows about processPayment()
        paymentProcessor.processPayment();
    }
}

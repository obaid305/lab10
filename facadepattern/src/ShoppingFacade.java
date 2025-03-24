public class ShoppingFacade {

    private ProductCatalog catalog;
    private PaymentProcessor payment;
    private OrderManager orderManager;

    public ShoppingFacade() {
        this.catalog = new ProductCatalog();
        this.payment = new PaymentProcessor();
        this.orderManager = new OrderManager();
    }

    public void placeOrder(String productName, String paymentType) {
        catalog.listProducts();
        catalog.selectProduct(productName);
        payment.processPayment(paymentType);
        orderManager.createOrder(productName);
        System.out.println("✅ Order placed successfully!");
    }
}

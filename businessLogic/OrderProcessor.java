public class OrderProcessor {
    public void processOrder(String orderId) {
        System.out.println("Processing order: " + orderId);
        PaymentService payment = new PaymentService();
        payment.processPayment(orderId);
    }
}
package Exercise2;

public class Main {
    public static void main(String[] args) {
        
        PaymentProcessor processor = new PaymentProcessor();

        processor.registerPaymentMethod("credit", new CreditCardPayment());
        processor.registerPaymentMethod("paypal", new PayPalPayment());

        processor.processPayment("credit");
        processor.processPayment("paypal");
    }
}

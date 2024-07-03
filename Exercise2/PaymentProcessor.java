package Exercise2;

import java.util.HashMap;
import java.util.Map;

public class PaymentProcessor {
    private Map<String, PaymentMethod> paymentMethods = new HashMap<>();

    public void registerPaymentMethod(String paymentType, PaymentMethod paymentMethod) {
        paymentMethods.put(paymentType, paymentMethod);
    }

    public void processPayment(String paymentType) {
        PaymentMethod paymentMethod = paymentMethods.get(paymentType);
        if (paymentMethod != null) {
            paymentMethod.processPayment();
        } else {
            throw new IllegalArgumentException("Payment method not supported: " + paymentType);
        }
    }
}


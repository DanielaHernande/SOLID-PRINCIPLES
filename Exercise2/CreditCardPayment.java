package Exercise2;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public void processPayment() {

        System.out.println("Credit card payment processing");
    }
}

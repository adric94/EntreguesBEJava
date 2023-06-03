package exercici;

public class PaymentGateway {
    public void processPayment(PaymentMethod paymentMethod, PaymentCallback callback) {
       
        paymentMethod.processPayment(callback);
    }
}
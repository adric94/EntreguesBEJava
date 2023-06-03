package exercici;

public class PaypalPayment implements PaymentMethod{

	@Override
	public void processPayment(PaymentCallback callback) {
		boolean paymentSuccess = true;
		
		if (paymentSuccess) {
            callback.paymentSuccess();
        } else {
            callback.paymentFailure("El pagament amb Paypal ha fallat");
        }
		
	}
	
}

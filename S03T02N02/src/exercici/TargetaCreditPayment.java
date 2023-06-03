package exercici;

public class TargetaCreditPayment implements PaymentMethod{

	@Override
	public void processPayment(PaymentCallback callback) {
		boolean paymentSuccess = true;
		
		if (paymentSuccess) {
            callback.paymentSuccess();
        } else {
            callback.paymentFailure("El pagament amb targeta ha fallat");
        }
		
	}
	
}

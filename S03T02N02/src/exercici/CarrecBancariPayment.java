package exercici;

public class CarrecBancariPayment implements PaymentMethod{

	@Override
	public void processPayment(PaymentCallback callback) {
		boolean paymentSuccess = true;
		
		if (paymentSuccess) {
            callback.paymentSuccess();
        } else {
            callback.paymentFailure("El pagament a càrrec ha fallat");
        }
		
	}
	
}

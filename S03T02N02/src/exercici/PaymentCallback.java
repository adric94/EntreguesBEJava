package exercici;

public interface PaymentCallback {
	void paymentSuccess();
	void paymentFailure(String errorMessage);
}

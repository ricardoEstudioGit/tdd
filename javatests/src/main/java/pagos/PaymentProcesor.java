package pagos;

public class PaymentProcesor {

    private PaymentGateway paymentGateway;

    public PaymentProcesor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment (double amount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));
        if (response.getStatus() == PaymentResponse.PaymentStatus.ERROR) {
            return false;
        } else {
            return true;
        }
    }

}

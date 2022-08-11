package pagos;

public interface PaymentGateway {

    PaymentResponse requestPayment (PaymentRequest request);

}

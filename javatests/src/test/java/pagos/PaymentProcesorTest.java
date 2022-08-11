package pagos;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcesorTest {

    // pago se realiza correctamente 1 escenario

    @Test
    public void paymentIsCorrect () {

        //simulamos la interfaz PaymentGateway con Mockito
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        //simular con mockito que cuando al paymentgateway se le haga un request
        /*
           Mockito.any(): cualquier tipo de request
         */

        // es true el pago porque el PaymentGateway ha ido bien
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));


        PaymentProcesor paymentProcesor = new PaymentProcesor(paymentGateway);

        // espero que sea true el pago
        assertTrue(paymentProcesor.makePayment(1000));

    }

    @Test
    public void paymentIsNotCorrect () {

        //simulamos la interfaz PaymentGateway con Mockito
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        // cuando se le haga un request al gateway le decimos que devuelva error, como cuando deciamos el dado tiene que devolver 2
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));


        PaymentProcesor paymentProcesor = new PaymentProcesor(paymentGateway);

        // espero que sea true el pago
        assertFalse(paymentProcesor.makePayment(1000));

    }

}
package com.platzi.javatests.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGetaway paymentGetaway;
    private PaymentProcessor paymentProcessor;

    @Before // Sirve para indicar a Junit que debe ejecutar esta funcion antes de cada método, cada que ejecuta un test prueba esta parte.
    public void setup(){
         paymentGetaway = Mockito.mock(PaymentGetaway.class);
         paymentProcessor = new PaymentProcessor(paymentGetaway);


    }

    @Test
    public void payment_is_correct(){

        // Preparacion del escenario

        Mockito.when(paymentGetaway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        // estamos probando el resultado
        assertTrue(paymentProcessor.makePayment(1000));

    }

    @Test
    public void payment_is_wrong(){
        Mockito.when(paymentGetaway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(paymentProcessor.makePayment(1000));

    }

}
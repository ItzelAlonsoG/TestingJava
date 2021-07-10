package com.platzi.javatests.payments;

public class PaymentProcessor {

    private PaymentGetaway paymentGetaway;

    public PaymentProcessor(PaymentGetaway paymentGetaway) {
        this.paymentGetaway = paymentGetaway;
    }

    public boolean makePayment (double amount){
       PaymentResponse response =  paymentGetaway.requestPayment(new PaymentRequest(amount));
     if (response.getStatus() == PaymentResponse.PaymentStatus.OK){
         return  true;
     } else{
         return false;
     }
    };
}

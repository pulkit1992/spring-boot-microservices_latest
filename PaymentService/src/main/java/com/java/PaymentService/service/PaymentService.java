package com.java.PaymentService.service;


import com.java.PaymentService.model.PaymentRequest;
import com.java.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}

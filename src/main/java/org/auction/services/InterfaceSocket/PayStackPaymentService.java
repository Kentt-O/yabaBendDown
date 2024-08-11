package org.auction.services.InterfaceSocket;

import org.auction.DTOs.Request.PaymentRequest;
import org.auction.DTOs.Response.PaymentResponse;
import org.springframework.http.ResponseEntity;


public interface PayStackPaymentService {
   ResponseEntity<PaymentResponse> payOut(PaymentRequest paymentRequest);
}

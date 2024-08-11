package org.auction.services.Implementation;

import org.auction.DTOs.Request.PaymentRequest;
import org.auction.DTOs.Response.PaymentResponse;
import org.auction.services.InterfaceSocket.PayStackPaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PayStackPaymentServiceImplTest {
    @Autowired
    private PayStackPaymentService paymentService;

    @Test
    public void paymentIntegrationTest(){
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setAmount("1000");
        paymentRequest.setEmail("prod.byKent@gmail.com");

        ResponseEntity<PaymentResponse> response = paymentService.payOut(paymentRequest);

//        assertTrue(response.getBody());
//        assertNotNull(response);
//        assertEquals(200, response.getStatusCode().value());
    }

}
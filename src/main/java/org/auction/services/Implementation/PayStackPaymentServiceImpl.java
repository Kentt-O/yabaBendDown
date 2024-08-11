package org.auction.services.Implementation;

import lombok.RequiredArgsConstructor;
import org.auction.DTOs.Request.PaymentRequest;
import org.auction.DTOs.Response.PaymentResponse;
import org.auction.config.PayStackConfig;
import org.auction.services.InterfaceSocket.PayStackPaymentService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PayStackPaymentServiceImpl implements PayStackPaymentService {
    private final PayStackConfig payStackConfig;

    @Override
    public ResponseEntity<PaymentResponse> payOut(PaymentRequest paymentRequest) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Map<String, Object>> request = paymentIntegration(paymentRequest);

        ResponseEntity<PaymentResponse> response = restTemplate.postForEntity(payStackConfig.getPayStackURL(), request, PaymentResponse.class);
        return response;
    }

    private HttpEntity<Map<String, Object>> paymentIntegration(PaymentRequest paymentRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer "+payStackConfig.getPayStackApiKey());

        Map<String, Object>body = new HashMap<>();
        body.put("amount" , paymentRequest.getAmount());
        body.put("email" , paymentRequest.getEmail());

        return new HttpEntity<>(body, headers);
    }
}

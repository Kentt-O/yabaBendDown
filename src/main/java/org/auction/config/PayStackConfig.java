package org.auction.config;

import lombok.Getter;
import org.auction.data.model.PayStackPayment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@Getter
public class PayStackConfig {

    @Value("${paystack.api.key}")
    private String payStackApiKey;

    @Value("${paystack.url}")
    private String payStackURL;

    @Bean
    public PayStackPayment paystack() {
        Map<String, String> config = new HashMap<>();
        config.put("apiKey", payStackApiKey);
        config.put("baseURL", payStackURL);

        return new PayStackPayment();
    }
}

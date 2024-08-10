package org.example.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
public class PayStackPayment {
    private String id;
    private String highestBidderName;
    private String reference;
    private BigDecimal amount;
    private String gatewayResponse;
    private String paidAt;
    private String createdAt;
    private String channel;
    private String currency;
    private String ipAddress;
}

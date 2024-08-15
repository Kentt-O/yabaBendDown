package org.auction.data.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@Document
public class PayStackPayment {
    private String id;
    private BigDecimal amount;
    private String email;
    private LocalDateTime paidAt = LocalDateTime.now();
}

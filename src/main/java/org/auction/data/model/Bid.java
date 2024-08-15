package org.auction.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
public class Bid {
    @Id
    private String id;
    private String userId;
    private BigDecimal amount;
}

package org.example.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
public class Bid {
    private String id;
    private BigDecimal currentBid;
    private BigDecimal maximumBid;
}

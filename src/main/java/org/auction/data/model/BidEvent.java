package org.auction.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@Document(collection = "bidEvents")
public class BidEvent {
    @Id
    private String bidId;
    private String customerId;
    private BigDecimal bidAmount;
    private LocalDateTime createdAt = LocalDateTime.now();
}

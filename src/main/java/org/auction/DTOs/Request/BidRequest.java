package org.auction.DTOs.Request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
public class BidRequest {
    private String bidId;
    private String customerId;
    private BigDecimal bidAmount;
    private LocalDateTime timestamp;

}

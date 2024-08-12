package org.auction.DTOs.Response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class BidResponse {
    private String customerId;
    private BigDecimal bidAmount;
}

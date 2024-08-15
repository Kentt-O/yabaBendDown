package org.auction.DTOs.Response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Setter
@Getter
@Document
public class ClientAuctionResponse {
    private String auctionId;
    private BigDecimal bidAmount;
    private boolean bidAccepted;
}

package org.auction.DTOs.Request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
@Getter
@Setter
public class ClientAuctionRequest {
        @Id
        private String auctionId;
        private String itemName;
        private BigDecimal startingPrice;
        private String description;
}

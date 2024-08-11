package org.auction.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Payment {
    private String id;
    private Bid maximumBid;
}

package org.auction.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Payment {
    private String id;
    private Bid maximumBid;

    @DBRef
    List<Bid> bidList = new ArrayList<Bid>();
}

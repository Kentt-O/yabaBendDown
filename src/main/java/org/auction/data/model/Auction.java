package org.auction.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
@Data
public class Auction {
    @Id
    private String id;
    private String itemName;
    private String description;
    private Category category;
    private BigDecimal startBid;
    private LocalDateTime objectUploadDate = LocalDateTime.now();
    private Date objectSaleDate;

    @DBRef
    private List<Bid> bids = new ArrayList<>();
    private boolean isCompleted;

}

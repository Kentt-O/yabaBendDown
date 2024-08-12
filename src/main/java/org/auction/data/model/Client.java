package org.auction.data.model;

import lombok.Data;
import org.auction.utils.BidObserver;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class Client implements BidObserver {
    private String id;
    private String email;
    private String username;
    private String password;
    private ObjectInAuction objectInAuction;
    private Date itemUploadDate;
    private Bid amount;

    @Override
    public void update(BidEvent bidEvent) {

        System.out.println("Client notified of new bid: " + bidEvent.getBidAmount());
    }
}

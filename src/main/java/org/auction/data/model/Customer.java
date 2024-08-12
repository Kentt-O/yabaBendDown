package org.auction.data.model;

import lombok.Data;
import org.auction.utils.BidObserver;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Customer implements BidObserver {
    private String id;
    private String fullName;
    private String username;
    private String email;
    private boolean isOnline = false;
    private ObjectInAuction objectInAuction;

    @Override
    public void update(BidEvent bidEvent) {

        System.out.println("Customer notified of new bid: " + bidEvent.getBidAmount());
    }
}

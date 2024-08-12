package org.auction.data.model;

import lombok.Data;
import org.auction.utils.BidObserver;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Admin implements BidObserver {
    private String id;
    private String email;
    private String username;
    private String password;

    @Override
    public void update(BidEvent bidEvent) {
        System.out.println("Admin notified of new bid: " + bidEvent.getBidAmount());
    }
}

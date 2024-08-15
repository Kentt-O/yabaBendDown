package org.auction.data.model;

import lombok.Data;
import org.auction.utils.BidObserver;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class User implements BidObserver {
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private UserRoles role;

    @Override
    public void update(BidEvent bidEvent) {
        System.out.println("Users notified of new bid: " + bidEvent.getBidAmount());
    }
}

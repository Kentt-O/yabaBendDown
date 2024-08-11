package org.auction.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Customer {
    private String id;
    private String fullName;
    private String username;
    private String email;
    private boolean isOnline = false;
    private ObjectInAuction objectInAuction;
}

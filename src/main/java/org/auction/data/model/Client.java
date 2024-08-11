package org.auction.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class Client {
    private String id;
    private String email;
    private String username;
    private String password;
    private ObjectInAuction objectInAuction;
    private Date itemUploadDate;
    private Bid amount;
}

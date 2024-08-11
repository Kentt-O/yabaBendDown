package org.auction.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Admin {
    private String id;
    private String email;
    private String username;
    private String password;
}

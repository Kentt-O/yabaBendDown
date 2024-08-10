package org.example.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

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

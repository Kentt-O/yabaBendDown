package org.example.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
//    private Admin admin;
//    private Customer customer;
//    private Client client;
}

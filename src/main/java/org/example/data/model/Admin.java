package org.example.data.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class Admin {
    private String id;
    private String email;
    private String username;
    private String password;
}

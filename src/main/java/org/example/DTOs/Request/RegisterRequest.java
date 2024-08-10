package org.example.DTOs.Request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterRequest {
    private String fullName;
    private String email;
    private String username;
    private String password;
}

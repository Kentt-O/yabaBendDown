package org.example.exceptions;

public class UserNameNotFoundException extends Exception {
    public UserNameNotFoundException(String message){
        super(message);
    }
}

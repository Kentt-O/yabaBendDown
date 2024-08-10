package org.example.exceptions;

public class UserNameExistsException extends Exception {
    public UserNameExistsException(String message) {
        super(message);
    }
}

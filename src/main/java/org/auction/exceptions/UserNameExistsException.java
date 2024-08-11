package org.auction.exceptions;

public class UserNameExistsException extends Exception {
    public UserNameExistsException(String message) {
        super(message);
    }
}

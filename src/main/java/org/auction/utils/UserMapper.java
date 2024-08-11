package org.auction.utils;
import org.auction.DTOs.Response.LoginResponse;
import org.auction.DTOs.Response.RegisterResponse;

import org.auction.data.model.User;

public class UserMapper {
    public static User userMapper(String email, String username, String password){
        User user = new User();
        user.setEmail(email);
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }

    public static RegisterResponse registerResponse(String message) {
        RegisterResponse response = new RegisterResponse();
        response.setMessage(message);
        return response;
    }

    public static LoginResponse logInUser(String message){
        LoginResponse response = new LoginResponse();
        response.setMessage(message);
        return response;
    }

}

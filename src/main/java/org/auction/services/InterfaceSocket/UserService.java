package org.auction.services.InterfaceSocket;

import org.auction.DTOs.Request.LoginRequest;
import org.auction.DTOs.Request.LogoutRequest;
import org.auction.DTOs.Request.RegisterRequest;
import org.auction.DTOs.Response.LoginResponse;
import org.auction.DTOs.Response.LogoutResponse;
import org.auction.DTOs.Response.RegisterResponse;
import org.auction.exceptions.UserNameExistsException;
import org.auction.exceptions.UserNameNotFoundException;

public interface UserService {
    LoginResponse logInUser(LoginRequest newLoginRequest);
    LogoutResponse logOutUser(LogoutRequest newLogoutRequest);
    RegisterResponse register(RegisterRequest registerRequest) throws UserNameExistsException, UserNameNotFoundException;
}

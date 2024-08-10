package org.example.services.InterfaceSocket;

import org.example.DTOs.Request.LoginRequest;
import org.example.DTOs.Request.LogoutRequest;
import org.example.DTOs.Request.RegisterRequest;
import org.example.DTOs.Response.LoginResponse;
import org.example.DTOs.Response.LogoutResponse;
import org.example.DTOs.Response.RegisterResponse;
import org.example.exceptions.UserNameExistsException;
import org.example.exceptions.UserNameNotFoundException;

public interface UserService {
    LoginResponse logInUser(LoginRequest newLoginRequest);
    LogoutResponse logOutUser(LogoutRequest newLogoutRequest);
    RegisterResponse register(RegisterRequest registerRequest) throws UserNameExistsException, UserNameNotFoundException;
}

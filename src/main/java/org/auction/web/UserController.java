package org.auction.web;

import lombok.RequiredArgsConstructor;
import org.auction.DTOs.Request.LoginRequest;
import org.auction.DTOs.Request.RegisterRequest;
import org.auction.DTOs.Response.LoginResponse;
import org.auction.DTOs.Response.RegisterResponse;
import org.auction.services.InterfaceSocket.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest){
        try{
            RegisterResponse registerResponse = userService.register(registerRequest);
            return ResponseEntity.ok().body(registerResponse);
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
        try{
            LoginResponse loginResponse = userService.logInUser(loginRequest);
            return ResponseEntity.ok().body(loginResponse);
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    // other methods for login, logout, findObject, receivePayment etc.

}

package org.auction.services.Implementation;

import lombok.RequiredArgsConstructor;
import org.auction.DTOs.Request.LoginRequest;
import org.auction.DTOs.Request.LogoutRequest;
import org.auction.DTOs.Request.RegisterRequest;
import org.auction.DTOs.Response.LoginResponse;
import org.auction.DTOs.Response.LogoutResponse;
import org.auction.DTOs.Response.RegisterResponse;
import org.auction.data.model.User;
import org.auction.data.repositories.UserRepository;
import org.auction.exceptions.UserNameExistsException;
import org.auction.exceptions.UserNameNotFoundException;
import org.auction.services.InterfaceSocket.UserService;
import org.springframework.stereotype.Service;

import static org.auction.utils.UserMapper.registerResponse;
import static org.auction.utils.UserMapper.userMapper;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public LoginResponse logInUser(LoginRequest newLoginRequest) {
        User logInDetails = userMapper(newLoginRequest.getEmail(), newLoginRequest.getUsername(),newLoginRequest.getPassword());
        try {
            User user = userRepository.findUserByUsername(newLoginRequest.getUsername());
            if (user == null) {
                throw new UserNameNotFoundException("Username not found");
            }
            if (!validatePassword(newLoginRequest.getPassword())) {
                throw new UserNameNotFoundException("Invalid password");
            }
            return new LoginResponse();

        } catch (UserNameNotFoundException | NullPointerException e) {
            e.printStackTrace();
            return new LoginResponse();
        }
    }

    @Override
    public LogoutResponse logOutUser(LogoutRequest newLogoutRequest) {
        return null;
    }

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) throws UserNameExistsException, UserNameNotFoundException {
        if (userDetails(registerRequest.getUsername())){
            throw new UserNameExistsException("Username taken, try another");
        }
        User userInfo = userMapper(registerRequest.getEmail(),registerRequest.getUsername(),registerRequest.getPassword());
        userRepository.save(userInfo);
        return registerResponse("Registration successful");
    }

    private Boolean userDetails(String username) throws UserNameNotFoundException {
        User user = userRepository.findUserByUsername(username);
        return  user != null;
    }

    private Boolean userDetailsForLogin(String username) throws UserNameNotFoundException {
        User userLogin = userRepository.findUserByUsername(username);
        return userLogin  == null;
    }

    private Boolean validatePassword(String password){
        User userPassword = userRepository.findUserByPassword(password);
        return userPassword == null;
    }

}

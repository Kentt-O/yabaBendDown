package org.example.services.Implementation;

import lombok.RequiredArgsConstructor;
import org.example.DTOs.Request.LoginRequest;
import org.example.DTOs.Request.LogoutRequest;
import org.example.DTOs.Request.RegisterRequest;
import org.example.DTOs.Response.LoginResponse;
import org.example.DTOs.Response.LogoutResponse;
import org.example.DTOs.Response.RegisterResponse;
import org.example.data.model.User;
import org.example.data.repositories.UserRepository;
import org.example.exceptions.UserNameExistsException;
import org.example.exceptions.UserNameNotFoundException;
import org.example.services.InterfaceSocket.UserService;
import org.springframework.stereotype.Service;

import static org.example.utils.UserMapper.registerResponse;
import static org.example.utils.UserMapper.userMapper;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public LoginResponse logInUser(LoginRequest newLoginRequest) {
        User logInDetails = userMapper(newLoginRequest.getEmail(), newLoginRequest.getUsername(),newLoginRequest.getPassword());


//        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
//            response.setSuccess(true);
//            response.setMessage("Login successful");
//        } else {
//            response.setSuccess(false);
//            response.setMessage("Invalid username or password");
//        }
//
        return response;
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

package com.example.login_app.controllers;

import com.example.login_app.model.User;
import com.example.login_app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("api/login")
    public String login(@RequestBody User userLoginRequest) {
        if (userLoginRequest.getUsername() != null
        && userLoginRequest.getPassword() != null) {
            userRepository.save(userLoginRequest);
        } else {
            return "UserName Or Password Shouldn't be null";
        }
        return "Login successful for user: " + userLoginRequest.getUsername();
    }
}

/*class UserLoginRequest {
    private String username;
    private String password;

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}*/


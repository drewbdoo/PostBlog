package com.springBootCRUD.controller;

import com.springBootCRUD.model.User;
import com.springBootCRUD.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignupController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @PostMapping("/signup")
    public User signup(@RequestBody User user){
        return userServiceImpl.saveUser(user);
    }
}
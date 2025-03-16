package com.example.first.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.Models.UserModel;
import com.example.first.Services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class RestUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all-users")
    public List<UserModel> getMethodName() {
        return userService.getAllUsers();
    }
    
    
}

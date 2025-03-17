package com.example.first.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.Models.UserModel;
import com.example.first.Services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api")
public class RestUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all-users")
    public List<UserModel> getMethodName() {
        return userService.getAllUsers();
    }
    @GetMapping("user-by-ıd/{id}")
    public UserModel getUserById(@PathVariable(name = "id" ,required = true) int id ) {
        return userService.getUserById(id);
    }
    
    
}

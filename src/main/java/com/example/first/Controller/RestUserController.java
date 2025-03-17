package com.example.first.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.Models.UserModel;
import com.example.first.Services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class RestUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all-users")
    public List<UserModel> getMethodName() {
        return userService.getAllUsers();
    }
    @GetMapping("/user-by-ıd/{id}")
    public UserModel getUserById(@PathVariable(name = "id" ,required = true) int id ) {
        return userService.getUserById(id);
    }
    @PostMapping("/add-user")
    public UserModel addUser(@RequestBody UserModel model) {

        return userService.addUser(model);
    }
    @DeleteMapping("/delete-user/{id}")
    public UserModel deleteUserModel(@PathVariable(name="id" ,required = true) int id){
        return userService.deleteUserModel(id);
    }    
    
    @PutMapping("/update-user/{id}")
    public UserModel updateUser(@PathVariable(name="id",required = true) int id, @RequestBody UserModel user ){
        return userService.updateUser(id, user);
    }

}

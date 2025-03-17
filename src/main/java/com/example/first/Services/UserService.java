package com.example.first.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first.Models.UserModel;
import com.example.first.Repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUsers(){
        return userRepository.getAllUsers();
    }
    public UserModel getUserById(int id){
        return userRepository.getUserById(id);
    }

}

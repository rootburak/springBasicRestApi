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
    public UserModel addUser(UserModel user){
        return userRepository.addUser(user);
    }
    public UserModel deleteUserModel(int id){
        return userRepository.deleteUserModel(id);
    }
    public UserModel updateUser(int id, UserModel user){
        return userRepository.updateUser(id, user);
    }

}

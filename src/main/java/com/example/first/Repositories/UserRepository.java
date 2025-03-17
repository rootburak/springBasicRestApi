package com.example.first.Repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.first.Models.UserModel;

@Repository
public class UserRepository {

    @Autowired
    private List<UserModel> users;

    public List<UserModel> getAllUsers(){
        return users;
    }

    public UserModel getUserById(int id){
        for(UserModel model : users){
            if(model.getUserId() == id){
                return model;
            }  
        }
        return null;
    }

}

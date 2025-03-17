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
    public UserModel addUser(UserModel user){
        users.add(user);
        return user;
    }

    public UserModel deleteUserModel(int id){
        UserModel user = new UserModel();
        for(UserModel model:users){
            if(model.getUserId() == id){
                user.setUserId( model.getUserId());
                user.setUsername( model.getUsername());
                user.setPassword(model.getPassword());
                users.remove(model);
                return user;
            }
        }
        return null;
    }

    public UserModel updateUser(int id, UserModel user){
        for(UserModel model : users){
            if(model.getUserId() == id){
                users.remove(model);
                users.add(user);
                return user;
            }
        }    
        return null;
    }

}

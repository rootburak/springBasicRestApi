package com.example.first.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.first.Models.UserModel;

@Configuration
public class AppConfig {
    
    @Bean
    public List<UserModel> users(){
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(0, "burak", "123456"));
        users.add(new UserModel(1, "ali", "789012"));
        return users;
    }
}

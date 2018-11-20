package com.boot.demo.service;

import com.boot.demo.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User checkLogin(String name, String password) {
        User user = null;
        if (name == null || password == null) {
            return user;
        }
        if (!name.equals("") && password != "") {
            user = new User(name, password);
        }
        return user;
    }
}

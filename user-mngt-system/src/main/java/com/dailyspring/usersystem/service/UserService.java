package com.dailyspring.usersystem.service;

import com.dailyspring.usersystem.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllusers();
}

package com.dailyspring.usersystem.controller;

import com.dailyspring.usersystem.model.User;
import com.dailyspring.usersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {



    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }


    @GetMapping("/users")
    public List<User> getAllUsers(){

        return userService.getAllusers();

    }

}

package com.dailyspring.usersystem.service;

import com.dailyspring.usersystem.entity.UserEntity;
import com.dailyspring.usersystem.model.User;
import com.dailyspring.usersystem.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User saveUser(User user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user,userEntity);

        userRepository.save(userEntity);




        return user;
    }

    @Override
    public List<User> getAllusers() {

       List<UserEntity>userEntities = 
               userRepository.findAll();

        return null;
    }


}

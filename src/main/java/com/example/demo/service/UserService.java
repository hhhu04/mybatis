package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public List<User> userList(){
        return userMapper.findAll();
    }


    public User insert(){
        User user = new User();
        user.setUser_id("123456");
        user.setPassword("123123");
        userMapper.insertBoard(user);
        return user;
    }
}
